package control;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardDAO;

@WebServlet("/BoardListProcess")
public class BoardListProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doReqProcess(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doReqProcess(request, response);
	}
	
	protected void doReqProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		BoardDAO bdao=new BoardDAO();
		
		Vector<BoardBean> v=bdao.getAllBoard();
			
		request.setAttribute("v", v);
		
		
		RequestDispatcher dis=request.getRequestDispatcher("jsp/boardList.jsp");
		dis.forward(request, response);
			
		

}
}
