package com.ji.servlet003;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();

		String x = request.getParameter("x");
		String y = request.getParameter("y");
		
		int xx = Integer.parseInt(x);
		int yy = Integer.parseInt(y);

		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"></head><title>사칙연산");
		pw.print("</title>");
		pw.print("<style type=\"text/css\">");
		pw.print("#tdm{\r\n"
				+ "	text-align: center;\r\n"
				+ "	font-size: 25px;\r\n"
				+ "}");
		pw.print("</style>");
		pw.print("<body>");
		pw.print("<table align='center'>");
		pw.print("<tr><td style='font-size:40px'>[사칙연산]</td>");
		pw.print("</tr>");
		pw.print("</table>");
		pw.print("<table width = '400px' height = '500px' align='center' border='1'>");
		pw.print("<tr><td id='tdm'>"+xx +" + "+yy+ " = "+(xx+yy)+"</td></tr>");
		pw.print("<tr><td id='tdm'>"+xx +" - "+yy+ " = "+(xx-yy)+"</td></tr>");
		pw.print("<tr><td id='tdm'>"+xx +" * "+yy+ " = "+(xx*yy)+"</td></tr>");
		pw.print("<tr><td id='tdm'>"+xx +" / "+yy+ " = "+((double)xx/yy)+"</td></tr>");
		pw.print("</table>");

		pw.print("</body>");
		pw.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
