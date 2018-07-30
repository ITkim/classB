package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TrashDAO;
import model.domain.TrashDTO;


/**
 * Servlet implementation class AllController
 */
@WebServlet("/AllController")
public class AllController extends HttpServlet {
	
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			
			//<input type="hidden" name="command" value="login">
			//<input type="hidden" name="command" value="rename">
			String command = request.getParameter("command");
			
			if(command.equals("geo")) {
				geo(request, response);
			}else if(command.equals("bubble")){
				bubble(request, response);
			}
			
		}

	protected void geo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		String url = "error/errorView.jsp";
		
		try {
			ArrayList<TrashDTO> geo = TrashDAO.selectAll();
			
			if (geo.size() != 0) {// 데이터 존재
				request.setAttribute("geo", geo);	
				
				url = "Geochart.jsp";
			} else {
				request.setAttribute("msg", "자료가 없습니다.");
				url = "msgView.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

    
	protected void bubble(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		String url = "error/errorView.jsp";
		try {
			ArrayList<TrashDTO> bubble = TrashDAO.selectAll();
			if (bubble.size() != 0) {// 데이터 존재
				request.setAttribute("bubble", bubble);	
				
				url = "bubble.jsp";
			} else {
				request.setAttribute("msg", "자료가 없습니다.");
				url = "msgView.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	/*
	
	protected void function(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		ArrayList<TrashDTO> all = TrashDAO.selectAll();
		
		for(int i=0; i<all.size(); i++) {
			switch(all.getString(1)) {	
			case 
				
			
			}
		}
		Iterator it  = all.iterator();
		while(it.hasNext()){
			switch(get){
			case 
			}
		}
		
		request.getRequestDispatcher(url).forward(request, response);

	}
	*/

}
