package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import oracle.net.aso.a;
import util.DBUtil;

/*
 * select SUM (time1) from crimeTimeTable
where bigClassify = '���¹���';
 * */
public class CrimeTimeDAO {
	
	public static ArrayList<Long> selectCrime(String crimeName) throws Exception{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
			
		ArrayList<Long> all = null;
			
		try {
			con = DBUtil.getConnection();
			all = new ArrayList<Long>(); //all = new ArrayList<>();
				
			if(crimeName.equals("강력범죄")) {
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = '강력범죄'");	
			}else if(crimeName.equals("절도범죄")) {
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = '절도범죄'");
			}else if(crimeName.equals("폭력범죄")) {
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = '폭력범죄'");
			}else if(crimeName.equals("지능범죄")) {
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = '지능범죄'");
			}else {
				pstmt = con.prepareStatement("select sum(time1), sum(time2), sum(time3), sum(time4), sum(time5), sum(time6), sum(time7), sum(time8) from crimeTimeTable where bigClassify = '풍속점죄'");
			}
					
			rset = pstmt.executeQuery();
				
			if(rset.next()) {
				all.add(rset.getLong(1));
				all.add(rset.getLong(2));
				all.add(rset.getLong(3));
				all.add(rset.getLong(4));
				all.add(rset.getLong(5));
				all.add(rset.getLong(6));
				all.add(rset.getLong(7));
				all.add(rset.getLong(8));
			}
						
		}finally {
				DBUtil.close(con, pstmt, rset);
		}
			
		return all;
	}
}
