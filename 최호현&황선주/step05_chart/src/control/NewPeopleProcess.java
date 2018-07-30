package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.peopleDTO;
import model.peopleDAO;

/**
 * Servlet implementation class NewMemberProcess
 */
@WebServlet("/NewPeopleProcess")
public class NewPeopleProcess extends HttpServlet {
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "charprac.jsp";
		request.setCharacterEncoding("utf-8");
		
		peopleDTO bean=new peopleDTO();
		bean.setIncode(request.getParameter("incode"));
		bean.setAge(request.getParameter("age"));
		bean.setHeight(request.getParameter("height"));
		bean.setWeight(request.getParameter("weight"));
		bean.setWaist(request.getParameter("waist"));
		bean.setLefteye(request.getParameter("lefteye"));
		bean.setRighteye(request.getParameter("righteye"));
		bean.setLeftear(request.getParameter("leftear"));
		bean.setRightear(request.getParameter("rightear"));
		bean.setConpressure(request.getParameter("conpressure"));
		bean.setLoosepressure(request.getParameter("loosepressure"));
		bean.setBloodsugar(request.getParameter("Bloodsugar"));
		bean.setTotalchol(request.getParameter("totalchol"));
		bean.setTriglyceride(request.getParameter("triglyceride"));
		bean.setHDL(request.getParameter("HDL"));
		bean.setLDL(request.getParameter("LDL"));
		bean.setHeme(request.getParameter("heme"));
		bean.setUrin(request.getParameter("urin"));
		bean.setTinin(request.getParameter("tinin"));
		bean.setAST(request.getParameter("AST"));
		bean.setALT(request.getParameter("ALT"));
		bean.setGTP(request.getParameter("GTP"));
		bean.setSmoke(request.getParameter("smoke"));
		bean.setTeeth(request.getParameter("teeth"));

		try {
			peopleDAO.insertMember(bean);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", "죄송합니다. 잠시후에 재 실행해 주세요");
			url = "error/errorView.jsp";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}
}
