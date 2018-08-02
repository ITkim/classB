package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.DBUtil;
import model.CrimeDayDTO;

public class CrimeDayDAO {

	public static CrimeDayDTO selectCrime(String crimeName) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		CrimeDayDTO all = null;
		
		try {
			con = DBUtil.getConnection();
			
			if(crimeName.equals("강력범죄")) {
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = '강력범죄'");	
			}else if(crimeName.equals("절도범죄")) {
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = '절도범죄'");
			}else if(crimeName.equals("폭력범죄")) {
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = '폭력범죄'");
			}else if(crimeName.equals("지능범죄")) {
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = '지능범죄'");
			}else {
				pstmt = con.prepareStatement("select sum(sun), sum(mon), sum(tue), sum(wed), sum(thu), sum(fri), sum(sat) from crimeDayTable where bigClassify = '풍속범죄'");
			}
				
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				all = new CrimeDayDTO(crimeName,rset.getLong(1), rset.getLong(2), rset.getLong(3), rset.getLong(4), rset.getLong(5), rset.getLong(6), rset.getLong(7));
			}
			
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}
}
