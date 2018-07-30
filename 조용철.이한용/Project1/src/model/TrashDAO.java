package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.domain.TrashDTO;
import util.DBUtil;

public class TrashDAO {
	
	public static ArrayList<TrashDTO> selectAll() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		
		ArrayList<TrashDTO> all = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from garbage");
			rset = pstmt.executeQuery();

			all = new ArrayList<>();
		
			while(rset.next()) {
				all.add(new TrashDTO(rset.getString(1), 
									 rset.getFloat(2), 
									 rset.getFloat(3),
									 rset.getFloat(4),
									 rset.getFloat(5)
						
									 )
					);
			}
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		
		
	return all;
	}
	
}
