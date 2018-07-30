package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.domain.ForeignDTO;
import util.DBUtil;

public class ForeignDAO {
	
	/* 실행시 발생 가능한 경우의 수 
	 * 1. 정상 실행
	 * 		- 데이터들이 존재
	 * 			- 개별 고객 정보를 DTO로 생성해서 ArrayList
	 * 		- 데이터들 미 존재
	 * 2. 비정상 실행
	 * 		- 예외 발생 */
	public static ArrayList<ForeignDTO> selectAll() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<ForeignDTO> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from foreigner");
			rset = pstmt.executeQuery();
			
			all = new ArrayList<>();
		
			while(rset.next()) {
				all.add(new ForeignDTO(rset.getString(1), rset.getString(2), rset.getString(3),
						rset.getString(4), rset.getString(5), rset.getString(6),
						rset.getString(7), rset.getString(8), rset.getString(9),
						rset.getString(10), rset.getString(11), rset.getString(12),
						rset.getString(13), rset.getString(14), rset.getString(15),
						rset.getString(16)
						));
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}
	
	
	public static String selectNational(int national) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		//ArrayList<String> all = null;
		//String all = "";
		String text = "";
		
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement("select * from foreigner where national=?");
			switch(national) {
			case 1: pstmt.setString(1, "미국"); break;
			case 2: pstmt.setString(1, "몽골"); break;
			case 3: pstmt.setString(1, "홍콩"); break;
			case 4: pstmt.setString(1, "필리핀"); break;
			default: break;
			
			}
			
			rset = pstmt.executeQuery();
			int age20 = 0;
			int age30 = 0;
			int age40 = 0;
			int age50 = 0;
			int age60 = 0;
			int age60up = 0;
			
			while(rset.next()) {

				age20 += Integer.parseInt(rset.getString(4).replaceAll(",", "")) + Integer.parseInt(rset.getString(5).replaceAll(",", ""))
						+ Integer.parseInt(rset.getString(6).replaceAll(",", "")) + Integer.parseInt(rset.getString(7).replaceAll(",", ""));
				age30 += Integer.parseInt(rset.getString(8).replaceAll(",", "")) + Integer.parseInt(rset.getString(9).replaceAll(",", ""));
				age40 += Integer.parseInt(rset.getString(10).replaceAll(",", "")) + Integer.parseInt(rset.getString(11).replaceAll(",", ""));
				age50 += Integer.parseInt(rset.getString(12).replaceAll(",", "")) + Integer.parseInt(rset.getString(13).replaceAll(",", ""));
				age60 += Integer.parseInt(rset.getString(14).replaceAll(",", "")) + Integer.parseInt(rset.getString(15).replaceAll(",", ""));
				age60up += Integer.parseInt(rset.getString(16).replaceAll(",", ""));
			
			}
			text = "[['연령대', '체류자수'],[" + "'0~19'," + age20 + "],[" + "'20~29'," + age30 + "],["
					+ "'30~39'," + age40 + "],[" + "'40~49'," + age50 + "],[" + "'50~59'," + + age60 + "],[" 
					+  "'60~'," + age60up + "]]";
			
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return text;
	}
	

public static String selectCount(String national) throws Exception {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	
	//ArrayList<String> all = null;
	//String all = "";
	String text = "";
	
	try {
		con = DBUtil.getConnection();
		
		pstmt = con.prepareStatement("select national, gend_total from foreigner where national='" + national + "'");
//				//+ "or '몽골' or '홍콩' or '필리핀' or '타이' or '일본'");
//		
//		switch(national) {
//		case 1: pstmt.setString(1, "미국"); break;
//		case 2: pstmt.setString(1, "몽골"); break;
//		case 3: pstmt.setString(1, "홍콩"); break;
//		case 4: pstmt.setString(1, "필리핀"); break;
//		default: break;
//		
//		}
		//pstmt.setString(1, "'" + national + "'");
		rset = pstmt.executeQuery();
//		int totalUSA = 0;
//		int totalMongol = 0;
//		int totalHongkong = 0;
//		int totalPhilipine = 0;
//		int totalThai = 0;
//		int totalJapan = 0;
		int total = 0;
		
		while(rset.next()) {
			total += Integer.parseInt(rset.getString(2).replaceAll(",", ""));
//			totalUSA += Integer.parseInt(rset.getString(2).replaceAll(",", ""));
//			totalMongol += Integer.parseInt(rset.getString(2).replaceAll(",", ""));
//			totalHongkong += Integer.parseInt(rset.getString(2).replaceAll(",", ""));
//			totalPhilipine += Integer.parseInt(rset.getString(2).replaceAll(",", ""));
//			totalThai += Integer.parseInt(rset.getString(2).replaceAll(",", ""));
//			totalJapan += Integer.parseInt(rset.getString(2).replaceAll(",", ""));
		}
		text = "['" + national + "'," + total + "]";
		
	}finally {
		DBUtil.close(con, pstmt, rset);
	}
	return text;
}

public static ArrayList<ForeignDTO> total() throws Exception {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	
	ArrayList<ForeignDTO> total = null;
	try {
		con = DBUtil.getConnection();
		pstmt = con.prepareStatement("select * from foreigner where national='총계' and gender ='T'");
		rset = pstmt.executeQuery();
		
		total = new ArrayList<>();
	
		while(rset.next()) {
			total.add(new ForeignDTO(rset.getString(1), rset.getString(2), rset.getString(3),
					rset.getString(4), rset.getString(5), rset.getString(6),
					rset.getString(7), rset.getString(8), rset.getString(9),
					rset.getString(10), rset.getString(11), rset.getString(12),
					rset.getString(13), rset.getString(14), rset.getString(15),
					rset.getString(16)
					));
		}
	}finally {
		DBUtil.close(con, pstmt, rset);
	}
	return total;
}
}



