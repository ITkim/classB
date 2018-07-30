package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBUtil;

public class peopleDAO {
	
	
	public static void insertMember(peopleDTO bean) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try { 
			con = DBUtil.getConnection();
			String sql="insert into member values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bean.getIncode());
			pstmt.setString(2, bean.getAge());
			pstmt.setString(3, bean.getHeight());
			pstmt.setString(4, bean.getWeight());
			pstmt.setString(5, bean.getWaist());
			pstmt.setString(6, bean.getLefteye());
			pstmt.setString(7, bean.getRighteye());
			pstmt.setString(8, bean.getLeftear());
			pstmt.setString(9, bean.getRightear());
			pstmt.setString(10, bean.getConpressure());
			pstmt.setString(11, bean.getLoosepressure());
			pstmt.setString(12, bean.getBloodsugar());
			pstmt.setString(13, bean.getTotalchol());
			pstmt.setString(14, bean.getTriglyceride());
			pstmt.setString(15, bean.getHDL());
			pstmt.setString(16, bean.getLDL());
			pstmt.setString(17, bean.getHeme());
			pstmt.setString(18, bean.getUrin());
			pstmt.setString(19, bean.getTinin());
			pstmt.setString(20, bean.getAST());
			pstmt.setString(21, bean.getALT());
			pstmt.setString(22, bean.getGTP());
			pstmt.setString(23, bean.getSmoke());
			pstmt.setString(24, bean.getTeeth());
			
			
			pstmt.executeUpdate();
		}finally {
			DBUtil.close(con, pstmt);
		}
	}
	
	
	public static ArrayList<Integer> ageheight(int age) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Integer> allData = null;
		
		try { 
			con = DBUtil.getConnection();
			String sql="select height from people where age between ? and ?";
			pstmt=con.prepareStatement(sql);
			if(age == 10) {
				pstmt.setInt(1, 2);
				pstmt.setInt(2, 4);
			}else if(age == 20) {
				pstmt.setInt(1, 4);
				pstmt.setInt(2, 6);
			}else if(age == 30) {
				pstmt.setInt(1, 6);
				pstmt.setInt(2, 8);
			}else if(age == 40) {
				pstmt.setInt(1, 8);
				pstmt.setInt(2, 10);
			}else if(age == 50) {
				pstmt.setInt(1, 10);
				pstmt.setInt(2, 12);
			}else if(age == 60) {
				pstmt.setInt(1, 12);
				pstmt.setInt(2, 14);
			}else if(age == 70) {
				pstmt.setInt(1, 14);
				pstmt.setInt(2, 16);
			}else if(age == 80) {
				pstmt.setInt(1, 16);
				pstmt.setInt(2, 18);
			}else if(age == 90) {
				pstmt.setInt(1, 18);
				pstmt.setInt(2, 20);
			}
			
			rset = pstmt.executeQuery();
			allData = new ArrayList<Integer>();
			while(rset.next()){
				allData.add(rset.getInt(1));
			}
			
		}finally {
			DBUtil.close(con, pstmt);
		}
		return allData;
	}
}
