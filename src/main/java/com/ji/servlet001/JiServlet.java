package com.ji.servlet001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet : WAS에서만 실행 가능 > Tomcat 환경에서만 실행 가능

// html + css + JavaScript : 프로그래밍 언어 기능이 부족.

@WebServlet("/JiServlet")
public class JiServlet extends HttpServlet {
	
	// 현재 : HTTP
	//		돈 주고 인증서 사와서 톰캣에 세팅 : https
	
	// Internet
	//		http/https 통신하는 것?
	
	private static final long serialVersionUID = 1L;
       
    public JiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	// GET 방식 요청 받을 때 : 어떤 사이트에 처음 접속하는 건 무조건 GET 방식.
	// 		주소를 알고 있어서 직접 타이핑해서 접속.
	//		포털사이트에서 검색 > 클릭
	//		사이트 내부에서 클릭
    //		URL 창에 Client의 요청 정보를 쓸 수 있으면 GET 방식이 가능(?value=num&value=...)

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 한글 처리
		response.setCharacterEncoding("UTF-8");
		
		// 응답객체.setContentType("text/html; charset=UTF-8");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><meta charset=\"UTF-8\"></head>");
		pw.print("<body>");
		for(int i=0;i<3;i++) {
			pw.print("<marquee width=\"1000px\"><h1 style='color:violet;'>hello! 안녕!</h1></marquee>");
		}	
		pw.print("</body>");
		pw.print("</html>");
	}
	
	// POST 방식 요청 받을 때 :
	//		프로그램 내부적으로 프로그램을 통해서만 가능하다.
	//		URL 창에 Client의 요청 정보를 쓸 수 없으면 POST 방식으로만.
	//		회원가입, 블로그 포스팅, 음악 업로드 등.
	//		URL 창에 인자나 글자로 표현할 수 없는 상황에서 사용.

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
