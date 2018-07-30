package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.*;
import util.DBUtil;

public class CrimeDAO {
	
	public static ArrayList<CrimeDTO> selectCrime(int gen) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		//0Àº ³²ÀÚ 1Àº ¿©ÀÚ
		ArrayList<CrimeDTO> all = null;
		String sql = "";
		try {
			con = DBUtil.getConnection();
			if(gen ==0) {
				sql = "select sum(man1), sum(man2), sum(man3), sum(man4), sum(man5), sum(man6), sum(man7)\r\n" + 
						"from crimeTable\r\n" + 
						"where bigclassify='°­·Â¹üÁË' or bigclassify = 'Àıµµ¹üÁË'  or bigclassify = 'Æø·Â¹üÁË' or bigClassify = 'Áö´É¹üÁË' or bigClassify = 'Ç³¼Ó¹üÁË'";
			}
			else {
				sql = "select sum(woman1), sum(woman2), sum(woman3), sum(woman4), sum(woman5), sum(woman6), sum(woman7)\r\n" + 
						"from crimeTable\r\n" + 
						"where bigclassify='°­·Â¹üÁË' or bigclassify = 'Àıµµ¹üÁË'  or bigclassify = 'Æø·Â¹üÁË' or bigClassify = 'Áö´É¹üÁË' or bigClassify = 'Ç³¼Ó¹üÁË'";
			}
			
			pstmt = con.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			all = new ArrayList<CrimeDTO>(); //all = new ArrayList<>();
			
			while(rset.next()) {
				all.add(new CrimeDTO(gen,
									 rset.getLong(1),
									 rset.getLong(2),
									 rset.getLong(3),
									 rset.getLong(4),
									 rset.getLong(5),
									 rset.getLong(6),
									 rset.getLong(7)));
			}
			
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}
}
