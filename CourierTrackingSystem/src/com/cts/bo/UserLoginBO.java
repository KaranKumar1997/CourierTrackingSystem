package com.cts.bo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.vo.Admin;
import com.cts.vo.Package;
import com.cts.vo.User;

import co.cts.dao.AdminDAOImple;
import co.cts.dao.UserDAOImple;

/**
 * Servlet implementation class UserLoginBO
 */
@WebServlet("/UserLoginBOValidation")
public class UserLoginBO extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserLoginBO() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		try
		{
		long customerId=Long.parseLong(request.getParameter("customerId"));
		String password=request.getParameter("password");
				
		HttpSession s=request.getSession(true);
		//String cust=String.valueOf(customerId);
		User u=new User();
		u.setCustomerId(customerId);
		u.setPassword(password);
		UserDAOImple udo=new UserDAOImple();
		int result=udo.validation(u);
		
		if(result==1)
		{
			//HttpSession s=request.getSession(true);
			s.setAttribute("ref",customerId);
			System.out.println(new Date(s.getCreationTime()));
			System.out.println(new Date(s.getLastAccessedTime()));
			ArrayList<Package> al=udo.retrive(u);
			request.setAttribute("al", al);
			RequestDispatcher rd=request.getRequestDispatcher("userHome.jsp");
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
