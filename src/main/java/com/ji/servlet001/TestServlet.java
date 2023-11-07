package com.ji.servlet001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost/11_07_1_Servlet/TestServlet

// Internet 주소 체계
//		http, https://		- 프로토콜(통신방식)
//		IP주소 or Domain주소	- 컴퓨터 주소
//		:port				- 80이면 생략 가능.(tomcat 서버 생성시 포트를 80으로 지정해놓았음. 그 외에는 생략 불가.)
//		/폴더명/폴더명/.../파일명	- 이쪽에다가 Client가 Request
//		?					- Parameter에 넣기 위한 연결고리
//		value=값&value=값...	- 요청 Parameter(Client가 Server에 Request 하는 것)

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestServlet() {
		super();
	}

	// 값이 Korean이면 한국어로 네 라는 말이 뜨게
	// 값이 English면 영어로 yes라는 말이 뜨게

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String language = request.getParameter("lang");
		
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();

		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"></head>");
		pw.print("<body>");
		pw.print("<h1>");
		if(language.equals("korean")) {
			pw.print("네");
		}else if(language.equals("english")) {
			pw.print("Yes");
		} else {
			pw.print("몰루?");
		}
		pw.print("</h1>");
		pw.print("</body>");
		pw.print("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
