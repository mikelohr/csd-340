package servlets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.ApplicationDao;

@SuppressWarnings("serial")
@WebServlet("/registerUser")
public class RegisterUserServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println(" collect all form data");
		String username = req.getParameter("username");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String activity = req.getParameter("activity");
		int age = Integer.parseInt(req.getParameter("age"));
		int goalWeight = Integer.parseInt(req.getParameter("goalWeight"));
		System.out.println(username);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(activity);
		System.out.println(age);
		System.out.println(goalWeight);
		
		

		System.out.println(" fill it up in a User bean");
		User user = new User(username, firstName, lastName, age, activity, goalWeight);
		
		

		System.out.println(" call DAO layer and save the user object to DB");
		ApplicationDao dao = new ApplicationDao();
		int rows = dao.registerUser(user);
		
		System.out.println("Number of rows " + rows);
		System.out.println("prepare an information message for user about the success or failure of the operation");
		String infoMessage = null;
		if(rows==0){
			infoMessage="Sorry, an error occurred!";
		}
		else{
			infoMessage="User registered successfully!";
		}

		System.out.println(" write the message back to the page in client browser");
		String page = getHTMLString(req.getServletContext().getRealPath("/register.jsp"), infoMessage);
		resp.getWriter().write(page);
				
				
	}
	
	public String getHTMLString(String filePath, String message) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line="";
		StringBuffer buffer = new StringBuffer();
		while((line=reader.readLine())!=null){
			buffer.append(line);
		}
		
		reader.close();
		String page = buffer.toString();
		
//		page = MessageFormat.format(page, message);
		
		return page;
		
		
	}
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page = getHTMLString(req.getServletContext().getRealPath("/register.jsp"), "");
		resp.getWriter().write(page);
	}

	
}
