package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ForeignDAO;
import model.domain.ForeignDTO;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	//재정의 메소드
		protected void service(HttpServletRequest request, 
								              HttpServletResponse response) 
								              throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			
			//<input type="hidden" name="command" value="login">
			//<input type="hidden" name="command" value="rename">
			String command = request.getParameter("command");
			
			if(command.equals("america")) {
				america(request, response);
			}
			else if(command.equals("mongol")) {
				mongol(request, response);
			}
			else if(command.equals("hongkong")) {
				hongkong(request, response);
			}
			else if(command.equals("philiphine")) {
				philiphine(request, response);
			}
			else if(command.equals("region")) {
				region(request, response);
			}	
			else if(command.equals("total")) {
				total(request, response);
			}

			else {
			}
		}
		
	private void total(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "error/errorView.jsp";
		try {
			ArrayList<ForeignDTO> total = ForeignDAO.total();
			if (total.size() != 0) {// 데이터 존재
				request.setAttribute("allData", total);
				url = "allView.jsp";
			} else {
				request.setAttribute("msg", "고객이 없습니다.");
				url = "msgView.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
		
		//모든 고객 정보 요청 및 응답 처리 하는 메소드
		/* 경우의 수
		 * 1. 검색된 고객들 존재
		 * 		- allView.jsp에 데이터 넘겨서 출력 위임
		 * 2. 고객들이 미존재 
		 * 		- msgView.jsp에 출력 위임
		 * 3. 예외 발생	
		 * 		- errorView.jsp에 예외 메세지 출력 위임 */

		private void america(HttpServletRequest request, 
						 HttpServletResponse response) 
						throws ServletException, IOException {
			String url = "error/errorView.jsp";
			try {
				String data = ForeignDAO.selectNational(1);
				if(data != "") {//데이터 존재
				request.setAttribute("allData",  data);
				url = "national.jsp";
			}else {
				request.setAttribute("msg", "고객이 없습니다.");
				url = "msgView.jsp";
			}
			} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
			}
			request.getRequestDispatcher(url).forward(request, response);
			}
		private void mongol(HttpServletRequest request, 
				 HttpServletResponse response) 
				throws ServletException, IOException {
	String url = "error/errorView.jsp";
	try {
		String data = ForeignDAO.selectNational(2);
		if(data != "") {//데이터 존재
		request.setAttribute("allData",  data);
		url = "national.jsp";
	}else {
		request.setAttribute("msg", "고객이 없습니다.");
		url = "msgView.jsp";
	}
	} catch (Exception e) {
	e.printStackTrace();
	request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
	}
	request.getRequestDispatcher(url).forward(request, response);
	}
		private void hongkong(HttpServletRequest request, 
				 HttpServletResponse response) 
				throws ServletException, IOException {
	String url = "error/errorView.jsp";
	try {
		String data = ForeignDAO.selectNational(3);
		if(data != "") {//데이터 존재
		request.setAttribute("allData",  data);
		url = "national.jsp";
	}else {
		request.setAttribute("msg", "고객이 없습니다.");
		url = "msgView.jsp";
	}
	} catch (Exception e) {
	e.printStackTrace();
	request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
	}
	request.getRequestDispatcher(url).forward(request, response);
	}
		private void philiphine(HttpServletRequest request, 
				 HttpServletResponse response) 
				throws ServletException, IOException {
	String url = "error/errorView.jsp";
	try {
		String data = ForeignDAO.selectNational(4);
		if(data != "") {//데이터 존재
		request.setAttribute("allData",  data);
		url = "national.jsp";
	}else {
		request.setAttribute("msg", "고객이 없습니다.");
		url = "msgView.jsp";
	}
	} catch (Exception e) {
	e.printStackTrace();
	request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
	}
	request.getRequestDispatcher(url).forward(request, response);
	}


	private void region(HttpServletRequest request, 
			 HttpServletResponse response) 
			throws ServletException, IOException {
		String url = "error/errorView.jsp";
		try {
			String data = "[['Country', 'Popularity']," + ForeignDAO.selectCount("미국") + ","
						 	+ ForeignDAO.selectCount("베트남") + "," + ForeignDAO.selectCount("필리핀") + ","
						 	+ ForeignDAO.selectCount("몽골") + "," + ForeignDAO.selectCount("러시아연방") + ","
						 	+ ForeignDAO.selectCount("일본") + "," + ForeignDAO.selectCount("일본") + "]";
			
			if(data != "") {//데이터 존재
				request.setAttribute("allData",  data);
				url = "national.jsp";
			}else {
				request.setAttribute("msg", "고객이 없습니다.");
				url = "msgView.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
		}
			request.getRequestDispatcher(url).forward(request, response);
	}

}