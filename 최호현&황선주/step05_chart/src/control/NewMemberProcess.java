package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberBean;
import model.MemberDAO;

/**
 * Servlet implementation class NewMemberProcess
 */
@WebServlet("/NewMemberProcess")
public class NewMemberProcess extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
		
		MemberBean bean=new MemberBean();
		bean.setMemid(request.getParameter("memid"));
		bean.setMempassword(request.getParameter("mempassword"));
		bean.setMemname(request.getParameter("memname"));
		bean.setMemage(Integer.parseInt(request.getParameter("memage")));
		bean.setMemgender(request.getParameter("memgender"));
		String year=request.getParameter("year");
		String month=request.getParameter("month");
		String day=request.getParameter("day");
		String membirth=year + "-" + month + "-" + day;
		
		bean.setMembirth(membirth);
		
		String memhp1=request.getParameter("memhp1");
		String memhp2=request.getParameter("memhp2");
		String memhp3=request.getParameter("memhp3");
		String memhp= memhp1 + "-" + memhp2 + "-"+ memhp3;
		bean.setMemhp(memhp);
		
		bean.setMemaddress(request.getParameter("memaddress"));
		
		String mememail1=request.getParameter("mememail1");
		String mememail2=request.getParameter("mememail2");
		String mememail=mememail1 + "@" + mememail2;
		
		bean.setMememail(mememail);

		
		//데이터베이스 객체 선언 후 저장
		//데이터베이스 객체 생성
		
		MemberDAO mdao=new MemberDAO();
		mdao.insertMember(bean);
		
		RequestDispatcher dis=request.getRequestDispatcher("newMemberOk.jsp");
		dis.forward(request, response);
	}
}
