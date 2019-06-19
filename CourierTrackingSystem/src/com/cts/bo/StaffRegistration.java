package com.cts.bo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.vo.Admin;

import co.cts.dao.AdminDAOImple;

/**
 * Servlet implementation class StaffRegistration
 */
@WebServlet("/StaffRegistrationModule")
public class StaffRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public StaffRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<head> <title> </title> <head> <body>");
	
		try
		{
			String firstName=request.getParameter("firstName");
			String lastName=request.getParameter("lastName");
			String gender=request.getParameter("gender");
			String email=request.getParameter("email");
			long contactNumber=Long.parseLong(request.getParameter("contactNumber"));
			//long employeeId=Long.parseLong(request.getParameter("employeeId"));
			String password=request.getParameter("password");
			long salary=Long.parseLong(request.getParameter("salary"));
			String designation=request.getParameter("designation");
			String permanentAddress=request.getParameter("permanentAddress");
			String correpondanceAddress=request.getParameter("correpondanceAddress");
			String loginType=request.getParameter("loginType");
			
			Admin a=new Admin();
			a.setFirstName(firstName);
			a.setLastName(lastName);
			a.setGender(gender);
			a.setEmail(email);
			a.setContactNumber(contactNumber);
			a.setPassword(password);
			a.setSalary(salary);
			a.setDesignation(designation);
			a.setPermanentAddress(permanentAddress);
			a.setCorrepondanceAddress(correpondanceAddress);
			a.setLoginType(loginType);
			AdminDAOImple ado=new AdminDAOImple();
			int result=ado.insertion(a);
			if(result==1)
			{
				//we have to say insereted status in this page
				out.print("<h2> Successfully Insereted<h2>");
				RequestDispatcher rd=request.getRequestDispatcher("staffRegistration.jsp");
				rd.forward(request, response);
			}
			else
			{
				//if not inserted
				out.print("<h2>Not Successfully Insereted<h2>");
				RequestDispatcher rd=request.getRequestDispatcher("staffRegistration.jsp");
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
