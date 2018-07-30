package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.*;
import util.DBUtil;

public class CrimeDAO {
	 
	/* 성별과 연령 별로 검색
	 * 대분류중 5가지 선별해서 검색
	 * 남자? 여자? 즉 int get이라는 parameter는 남자=0, 여자=1이라는 값으로
	 * 검색 
	 * 검색되는 데이터는 CrimeDTO 객체들 즉 
	 * Crime table의 데이터는 연령별 
	 *  */
	
	/* 실행 후 발생 가능한 경우의 수
	 * 1. 정상 실행
	 * 		1. 데이터 있다
	 * 			- ArrayList 객체에 CrimeDTO 들 저장된 상태로 반환
	 * 		2. 데이터 없다
	 * 			- CrimeDTO 객체가 없는 ArryaList 객체가 반환
	 * 2. 비정상 실행
	 * 		- 예외 발생    */
	public static ArrayList<CrimeDTO> selectCrime(int gen) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		//0은 남자 1은 여자
		ArrayList<CrimeDTO> all = null;
		try {
			con = DBUtil.getConnection();
			String sql = "select sum(woman1), sum(woman2), sum(woman3), sum(woman4), sum(woman5), sum(woman6), sum(woman7) from crimeTable where bigclassify='강력범죄' or bigclassify = '절도범죄'  or bigclassify = '폭력범죄' or bigClassify = '지능범죄' or bigClassify = '풍속범죄'";
			if(gen == 0) {
				sql = "select sum(man1), sum(man2), sum(man3), sum(man4), sum(man5), sum(man6), sum(man7) from crimeTable where bigclassify='강력범죄' or bigclassify = '절도범죄'  or bigclassify = '폭력범죄' or bigClassify = '지능범죄' or bigClassify = '풍속범죄'";
			}
			pstmt = con.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			all = new ArrayList<CrimeDTO>(); //all = new ArrayList<>();
			
			while(rset.next()) {
				all.add(new CrimeDTO(gen, rset.getLong(1), rset.getLong(2),	
													rset.getLong(3), rset.getLong(4),	 rset.getLong(5),
													rset.getLong(6), rset.getLong(7)));
			}
			
		}finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}
}
