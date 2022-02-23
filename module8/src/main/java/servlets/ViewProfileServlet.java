package servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.ApplicationDao;



@SuppressWarnings("serial")
@WebServlet("/getProfileDetails")
public class ViewProfileServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("get the username from the session");
		System.out.println("User name in profile servlet  :"+ request.getSession().getAttribute("username"));
		String username = (String)request.getSession().getAttribute("username");
		
		System.out.println("call dao and get profile details");
		ApplicationDao dao = new ApplicationDao();
		User user = dao.getProfileDetails(username);
		
		System.out.println("store all information in request object");
		request.setAttribute("user", user);
		
		
		System.out.println("forward control to profile jsp");
		request.getRequestDispatcher("/profile.jsp").forward(request, response);
		
	}


}
