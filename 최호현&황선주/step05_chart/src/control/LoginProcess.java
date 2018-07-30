package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberBean;
import model.MemberDAO;

/**
 * Servlet implementation class LoginProcess
 */
@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * doPost에서 로그인 처리
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 처리
		MemberBean bean=new MemberBean();
		
		bean.setMemid(request.getParameter("Memid"));
		bean.setMempassword(request.getParameter("Mempassword"));
		
		MemberDAO mdao= new MemberDAO();
		int result=mdao.loginCheck(bean);
		
		if(result==1) {		//회원인 경우
			HttpSession session=request.getSession();
			session.setAttribute("sid", bean.getMemid());
			
			RequestDispatcher dis=request.getRequestDispatcher("index.jsp");
			dis.forward(request, response);
		}else
			response.sendRedirect("jsp/loginForm.jsp");
	}
	
	
	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * doGet에서 로그아웃처리 
	 * logout() 메소드 호출해서 처리
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String command=request.getParameter("command");
		if(command.equals("logout"))
			logout(request,response);
	}
	
	
	
	
	protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.invalidate();
		session=null;
		response.sendRedirect("index.jsp");
	}

	
}
