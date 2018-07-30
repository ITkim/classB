package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;



public class BoardDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void getCon() {
		try {
			Context initctx=new InitialContext();
			Context envctx=(Context) initctx.lookup("java:comp/env");
			DataSource ds=(DataSource) envctx.lookup("jdbc/pool");
			con=ds.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		public Vector<BoardBean> getAllBoard() {
			Vector<BoardBean> v=new Vector<BoardBean> ();
			getCon();
			
			try {
				String sql="select*from board order by bbsNum desc";
				
				pstmt=con.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					BoardBean bean=new BoardBean();
					bean.setBbsNum(rs.getInt(1));
					bean.setBbsWriter(rs.getString(2));
					bean.setBbsSubject(rs.getString(3));
					bean.setBbsContent(rs.getString(4));
					bean.setBbsDate(rs.getDate(5).toString());
					
					
					v.add(bean);
				} con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}return v;
		}
	}

