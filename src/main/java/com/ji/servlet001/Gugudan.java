package com.ji.servlet001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Gugudan() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String gu = request.getParameter("Gu");
		int gugu= Integer.parseInt(gu);
		String dan = request.getParameter("Dan");
		int dandan = Integer.parseInt(dan);
		
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		
		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"></head>");
		pw.print("<body>");
		pw.print("<table width=\"400px\" height=\"550px\" border=\"1\">");
		pw.print("<tr><td style=\"font-size=\"40px\"\" align=\"center\">");
		pw.print(gugu+"단 "+dandan+"까지");
		pw.print("</td></tr>");
		for(int i=1;i<=dandan;i++) {
			pw.print("<tr><th style=\"font-size=\"30px\"\">"+gugu+" x "+i+" = "+(i*gugu)+"</th></tr>");
		}
		pw.print("</table>");
		pw.print("</body>");	
		pw.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
