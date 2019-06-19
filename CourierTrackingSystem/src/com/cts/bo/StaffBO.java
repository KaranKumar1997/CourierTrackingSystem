package com.cts.bo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.vo.Admin;

import co.cts.dao.AdminDAOImple;
import co.cts.dao.StaffDAOImple;

/**
 * Servlet implementation class StaffBO
 */
@WebServlet("/StaffValidation")
public class StaffBO extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public StaffBO() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		try
		{
		long employeeId=Long.parseLong(request.getParameter("employeeId"));
		String password=request.getParameter("password");
		String loginType=request.getParameter("loginType");
		
	
		Admin a=new Admin();
		a.setEmployeeId(employeeId);
		a.setPassword(password);
		a.setLoginType(loginType);
		StaffDAOImple sdo=new StaffDAOImple();
		int result=sdo.adminValidation(a);
		
		if(result==1)
		{
			HttpSession s=request.getSession(true);
			s.setAttribute("ref", employeeId);
			RequestDispatcher rd=request.getRequestDispatcher("staffHome.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
		}
		}
		catch(Exception ex)
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
		
	}

}
