package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void getCon() {
		try {
			Context initctx=new InitialContext();
			Context envctx=(Context) initctx.lookup("java:comp/env");
			DataSource ds= (DataSource) envctx.lookup("jdbc/pool");
			con=ds.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertMember(MemberBean bean) {
		getCon();
		
		try { 
			String sql="insert into member values(?,?,?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bean.getMemid());
			pstmt.setString(2, bean.getMempassword());
			pstmt.setString(3, bean.getMemname());
			pstmt.setInt(4, bean.getMemage());
			pstmt.setString(5, bean.getMemgender());
			pstmt.setString(6, bean.getMembirth());
			pstmt.setString(7, bean.getMemhp());
			pstmt.setString(8, bean.getMemaddress());
			pstmt.setString(9, bean.getMememail());
			
			pstmt.executeUpdate();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public int loginCheck(MemberBean bean) {
		getCon();
		
		String sql="select memPassword from member where memId=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bean.getMemid());
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) { 
				if(rs.getString(1).equals(bean.getMempassword()))
					return 1;
				else
					return 0;
			}
			
			return -1;
			
		}	catch(Exception e) {
			e.printStackTrace();
		}
			return -2;
	}
}
