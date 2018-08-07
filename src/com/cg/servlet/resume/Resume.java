package com.cg.servlet.resume;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rsm")
public class Resume extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Resume() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Candidate candidate = new Candidate();
		candidate.setAddress(request.getParameter("address"));
		candidate.setFirstName(request.getParameter("firstName"));
		candidate.setLastName(request.getParameter("lastName"));
		candidate.setGender(request.getParameter("gender"));
		candidate.setHighestQualification(request.getParameter("highestQualification"));
		candidate.setDateOfBirth(request.getParameter("dateOfBirth"));
		candidate.setContactNumber(request.getParameter("contactNumber"));
		candidate.setEmailId(request.getParameter("emailId"));
		candidate.setWebsite(request.getParameter("website"));
		candidate.setHobbies(request.getParameterValues("Hobbies"));
		candidate.setSkills(request.getParameterValues("Hobbies"));
		candidate.setDescription(request.getParameter("description"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp")
		
		
		
		
		
//		PrintWriter out = response.getWriter();
//		String fname=(String) request.getParameter("firstName");
//		String lastName=(String) request.getParameter("lastName");
//
//		out.write("<h1>Hello " + fname + " " + lastName +" </h1>" );
//				
				
				
				
				
				
				
				
			

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
