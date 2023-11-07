package com.ji.servlet003;

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
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();

		String name = request.getParameter("name");

		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"></head><title>이름 출력?");
		pw.print("</title>");
		pw.print("<body>");
		pw.print("<table align='center'>");
		pw.print("<tr><td style='font-size:40px'>[GET]</td>");
		pw.print("</tr>");
		pw.print("</table>");
		pw.print("<table align='center' style='font-size:30px'>");
		pw.print("<tr><td>반갑습니다 "+name+" 님.</td></tr>");
		pw.print("</table>");

		pw.print("</body>");
		pw.print("</html>");
	}
	
	// GET vs POST
	//		GET : 요청 파라미터가 주소에 있어서 우리가 눈으로 볼 수 있음.
	//		POST : 요청 파라미터가 주소에 없음. 내부적으로 정보 전달

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();

		String name2 = request.getParameter("name2");

		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"></head><title>이름 출력?");
		pw.print("</title>");
		pw.print("<body>");
		pw.print("<table align='center'>");
		pw.print("<tr><td style='font-size:40px'>[POST]</td>");
		pw.print("</tr>");
		pw.print("</table>");
		pw.print("<table align='center' style='font-size:30px'>");
		pw.print("<tr><td>반갑습니다 "+name2+" 님.</td></tr>");
		pw.print("</table>");

		pw.print("</body>");
		pw.print("</html>");
		
	}

}
