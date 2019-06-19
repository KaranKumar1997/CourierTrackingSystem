package com.cts.bo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.vo.Package;

import co.cts.dao.PackageDAOImple;

@WebServlet("/PackageInsertion")
public class PackageBO extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PackageBO() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<head> <title> </title> <head> <body>");
	
		try
		{
			String consignmentId=request.getParameter("consignmentId");
			String acceptDate=request.getParameter("acceptDate");
			String packageWeight=request.getParameter("packageWeight");
			String cost=request.getParameter("cost");
			String senderAddress=request.getParameter("senderAddress");
			
			long employeeId=Long.parseLong(request.getParameter("employeeId"));
			long customerId=Long.parseLong(request.getParameter("customerId"));
			String receiverAddress=request.getParameter("receiverAddress");
			//long salary=Long.parseLong(request.getParameter("salary"));
			String currentLocation=request.getParameter("currentLocation");
			//String permanentAddress=request.getParameter("permanentAddress");
			String packageStatus=request.getParameter("packageStatus");
			
			Package p=new Package();
			p.setAcceptDate(acceptDate);
			p.setPackageWeight(packageWeight);
			p.setCost(cost);
			p.setSenderAddress(senderAddress);
			p.setReceiverAddress(receiverAddress);
			p.setEmployeeId(employeeId);
			p.setCustomerId(customerId);
			p.setCurrentLocation(currentLocation);
			p.setPackageStatus(packageStatus);
			PackageDAOImple pdo=new PackageDAOImple();
			int result=pdo.insertion(p);
			if(result==1)
			{
				//we have to say insereted status in this page
				out.print("<h2> Successfully Insereted<h2>");
				
				RequestDispatcher rd=request.getRequestDispatcher("packageCreation.jsp");
				rd.forward(request, response);
			}
			else
			{
				//if not inserted
				out.print("<h2>Not Successfully Insereted<h2>");
				RequestDispatcher rd=request.getRequestDispatcher("index.html");
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


