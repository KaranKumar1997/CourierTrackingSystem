package com.cts.bo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.vo.User;

import co.cts.dao.UserDAOImple;
@WebServlet("/UserCreation")
public class UserBO extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserBO() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<head> <title> </title> </head> <body>");
		try
		{
			
			int result=0;
			String firstName=request.getParameter("firstName");
			String lastName=request.getParameter("lastName");
			String gender=request.getParameter("gender");
			String email=request.getParameter("email");
			long contactNumber=Long.parseLong(request.getParameter("contactNumber"));
			//long employeeId=Long.parseLong(request.getParameter("employeeId"));
			String password=request.getParameter("password");
			//HttpSession s=request.getSession(false);
			User u=new User();
			u.setFirstName(firstName);
			u.setLastName(lastName);
			u.setGender(gender);
			u.setEmail(email);
			u.setContactNumber(contactNumber);
			u.setPassword(password);
			
			UserDAOImple udo=new UserDAOImple();
			result=udo.insertion(u);
			if(result==1)
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("UserRegistration.jsp");
				out.print("inserted successfully");
				rd.include(request,response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("UserRegistration.jsp");
				rd.forward(request, response);
				
			}
			
		}
		catch(Exception ex)
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		out.print("</body> </html>");
	}

}
