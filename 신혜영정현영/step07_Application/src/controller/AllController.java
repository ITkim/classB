package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;


public class AllController extends HttpServlet {

	protected void service(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String command = request.getParameter("command");
		
		if(command.equals("crimeMan")) {
			crimeMan(request, response);
		}else if(command.equals("crimeWoman")) {
			crimeWoman(request, response);
		}else if(command.equals("crimeTime")) {
			crimeTime(request, response);
		}else if(command.equals("crimeDay")) {
			crimeDay(request, response);
		}else {
			System.out.println("전송실패");
			request.setAttribute("errorMsg","검색 시 문제 발생 재 시도 하세요");
			request.getRequestDispatcher("errorView.jsp").forward(request, response);
		}
	}

	private void crimeWoman(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "msgView.jsp";
		try {
			ArrayList<CrimeDTO> crimeWoman = CrimeDAO.selectCrime(1);
			
			if(crimeWoman.size() != 0) {
				for(int i=0; i<crimeWoman.size();i++) {
					System.out.println(crimeWoman.get(i));
				}
				request.setAttribute("crimeWoman", crimeWoman);
				url = "crimeWomanView.jsp";
				
			}else {
				request.setAttribute("msg", "검색된 데이터가 없습니다.");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("errorMsg","검색 시 문제 발생 재 시도 하세요");
			url = "errorView.jsp";
		}
		
		
		request.getRequestDispatcher(url).forward(request, response);
	}

	private void crimeMan(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "msgView.jsp";
		try {
			
			ArrayList<CrimeDTO> crimeMan = CrimeDAO.selectCrime(0);
			
			if(crimeMan.size() != 0) {
				
				request.setAttribute("crimeMan", crimeMan);
				url = "crimeManView.jsp";
				
			}else {
				request.setAttribute("msg", "검색된 데이터가 없습니다.");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("errorMsg","검색 시 문제 발생 재 시도 하세요");
			url = "errorView.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
		
	}


	private void crimeDay(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "msgView.jsp";
		try {
			ArrayList<CrimeDayDTO> crimeDay = new ArrayList<>();
			
			crimeDay.add(CrimeDayDAO.selectCrime("강력범죄"));
			crimeDay.add(CrimeDayDAO.selectCrime("절도범죄"));
			crimeDay.add(CrimeDayDAO.selectCrime("폭력범죄"));
			crimeDay.add(CrimeDayDAO.selectCrime("지능범죄"));
			crimeDay.add(CrimeDayDAO.selectCrime("풍속범죄"));
			
			if(crimeDay.size() != 0 ) {
				request.setAttribute("crimeDay", crimeDay);
				url = "crimeDayView.jsp";
			}else {
				request.setAttribute("msg", "검색된 데이터가 없습니다.");
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("errorMsg","검색 시 문제 발생 재 시도 하세요");
			url = "errorView.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

	private void crimeTime(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "msgView.jsp";
		
		try {
			ArrayList<Long> crimeTime1 = CrimeTimeDAO.selectCrime("강력범죄");
			ArrayList<Long> crimeTime2 = CrimeTimeDAO.selectCrime("절도범죄");
			ArrayList<Long> crimeTime3 = CrimeTimeDAO.selectCrime("폭력범죄");
			ArrayList<Long> crimeTime4 = CrimeTimeDAO.selectCrime("지능범죄");
			ArrayList<Long> crimeTime5 = CrimeTimeDAO.selectCrime("풍속범죄");
			
			ArrayList<CrimeTimeDTO> crimeTime = new ArrayList<>();
			
			String timeInterval;
			for(int i=0; i<8; i++) {
				if(i == 0) {
					timeInterval = "0:00-2:59";
				}else if(i ==1) {
					timeInterval = "3:00-5:59";
				}else if(i ==2) {
					timeInterval = "6:00-8:59";
				}else if(i ==3) {
					timeInterval = "9:00-11:59";
				}else if(i == 4) {
					timeInterval = "12:00-14:59";
				}else if(i == 5) {
					timeInterval = "15:00-17:59";
				}else if(i == 6) {
					timeInterval = "18:00-20:59";
				}else {
					timeInterval = "21:00-23:59";
				}
				
				crimeTime.add(new CrimeTimeDTO(timeInterval,crimeTime1.get(i), crimeTime2.get(i),crimeTime3.get(i),
						crimeTime4.get(i),crimeTime5.get(i)));
			}

			if(crimeTime.size() !=0) {
				request.setAttribute("crimeTime", crimeTime);
				url = "crimeTimeView.jsp";
			}else {
				request.setAttribute("msg","검색된 데이터가 없습니다.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("errorMsg","검색 시 문제 발생 재 시도 하세요");
			url = "errorView.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	
}








