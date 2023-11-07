package com.ji.servlet004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Output")
public class Output extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Output() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();

		String id = request.getParameter("id");
		String pass = request.getParameter("password");
		String gender = request.getParameter("gender");
		String location = request.getParameter("location");
		String[] checks = request.getParameterValues("check");
		String produce = request.getParameter("produce");
		
		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"><title>정보");
		pw.print("</title>");
		pw.print("<link rel=\"stylesheet\" href=\"../../../css/page.css\">");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<table style='background-color:black; color:white; font-size:30px' border='1' align='center'>");
		pw.print("<tr><td>");
		pw.print("<h>id : "+id+"</h><br>");
		pw.print("<h>password : "+pass+"</h><br>");
		pw.print("<h>gender : "+gender+"</h><br>");
		pw.print("<h>location : "+location+"</h><br>");
		pw.print("<h>hobby : ");
		for(int i=0;i<checks.length;i++) {
			pw.print(checks[i]);
			if((i+1)!=checks.length) {	
				pw.print(",");
			}
		}
		pw.print("</h><br>");
		pw.print("<h>"+produce+"</h>");
		pw.print("</tr></td>");
		pw.print("</table>");

		pw.print("</body>");
		pw.print("</html>");
	}

}
