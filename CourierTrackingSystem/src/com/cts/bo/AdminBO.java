package com.cts.bo;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.vo.Admin;

import co.cts.dao.AdminDAOImple;

/**
 * Servlet implementation class AdminBO
 */
@WebServlet("/Admin")
public class AdminBO extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminBO() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
		long employeeId=Long.parseLong(request.getParameter("employeeId"));
		String password=request.getParameter("password");
		String loginType=request.getParameter("loginType");
		HttpSession s=request.getSession(true);
		Admin a=new Admin();
		a.setEmployeeId(employeeId);
		a.setPassword(password);
		a.setLoginType(loginType);
		AdminDAOImple ado=new AdminDAOImple();
		int result=ado.adminValidation(a);
		
		if(result==1)
		{
			
			s.setAttribute("ref", employeeId);
			System.out.println(new Date(s.getCreationTime()));
			//System.out.println(new Date(s.getLastAccessedTime()));
			RequestDispatcher rd=request.getRequestDispatcher("adminHome.jsp");
			rd.forward(request, response);
			
		}
		else if(result==2)
		{
			//HttpSession s=request.getSession(true);
			s.setAttribute("ref", employeeId);
			System.out.println(new Date(s.getCreationTime()));
			//System.out.println(new Date(s.getLastAccessedTime()));
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
