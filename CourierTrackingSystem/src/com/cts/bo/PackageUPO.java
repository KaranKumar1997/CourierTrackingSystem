package com.cts.bo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.vo.Package;

import co.cts.dao.PackageDAOImple;

/**
 * Servlet implementation class PackageUPO
 */
@WebServlet("/PackageUpdation")
public class PackageUPO extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PackageUPO() {
        super();
      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{
		try
		{
		String currentLocation=request.getParameter("currentLocation");
		String packageStatus=request.getParameter("packageStatus");
		long employeeId=Long.parseLong(request.getParameter("employeeId"));
		long cosignmentId=Long.parseLong(request.getParameter("consignmentId"));
		Package p=new Package();
		p.setCurrentLocation(currentLocation);
		p.setPackageStatus(packageStatus);
		p.setCosignmentId(cosignmentId);
		p.setEmployeeId(employeeId);
		PackageDAOImple pdp=new PackageDAOImple();
		int result=pdp.updation(p);
		if(result==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("package.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("updatepackage.jsp");
			rd.forward(request, response);
		}
		}catch(Exception e)
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}

}
