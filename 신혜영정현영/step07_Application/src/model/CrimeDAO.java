package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.*;
import util.DBUtil;

/*
 * ���� �� �߻� ������ ����� ��
 * 1. �������
 * 	1. ������ �ִ�. - ArrayList ��ü�� CrimeDTO�� ������ ���·� ��ȯ
 *  2. ������ ����. - CrimeDTO ��ü�� ���� ArrayList ��ü�� ��ȯ
 *  
 * 2. ������ ���� - ���� �߻�
 * 
 * */
public class CrimeDAO {
	
	public static ArrayList<CrimeDTO> selectCrime(int gen) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		//0�� ���� 1�� ����
		ArrayList<CrimeDTO> all = null;
		
		try {
			con = DBUtil.getConnection();
			String sql = "select sum(woman1), sum(woman2), sum(woman3), sum(woman4), sum(woman5), sum(woman6), sum(woman7) from crimeTable where bigclassify='강력범죄' or bigclassify = '절도범죄'  or bigclassify = '폭력범죄' or bigClassify = '지능범죄' or bigClassify = '풍속범죄'";
			if(gen ==0) {
				sql = "select sum(man1), sum(man2), sum(man3), sum(man4), sum(man5), sum(man6), sum(man7) from crimeTable where bigclassify='강력범죄' or bigclassify = '절도범죄'  or bigclassify = '폭력범죄' or bigClassify = '지능범죄' or bigClassify = '풍속범죄'";
			}
			
			pstmt = con.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			all = new ArrayList<CrimeDTO>(); //all = new ArrayList<>();
			
			while(rset.next()) {
				all.add(new CrimeDTO(gen,rset.getLong(1),rset.getLong(2),rset.getLong(3),rset.getLong(4),rset.getLong(5),rset.getLong(6),rset.getLong(7)));
			}
			
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}
}
