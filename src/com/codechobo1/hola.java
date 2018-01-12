package com.codechobo1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="/HelloServelt", urlPatterns= {"/login/"})
public class hola extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// TODO Auto-generated method stub

		resp.setContentType("text/html; charset=UTF-8");

		PrintWriter out = resp.getWriter();

		

		String a="";

		

		for(int j=0; j<5; j++) {	

			for(int i=1; i<6; i++) {

				a +="*";

					if(i%5==0) {

						a+="<br>";

				}

			}

	}

		String[] cube = {

		"<img src='C:\\Users\\504CLASS-18\\eclipse-workspace\\MyWebSite\\WebContent\\image\\dice1.jpg'>",

		"<img src='C:\\Users\\504CLASS-18\\eclipse-workspace\\MyWebSite\\WebContent\\image\\dice2.jpg'>",

		"<img src='C:\\Users\\504CLASS-18\\eclipse-workspace\\MyWebSite\\WebContent\\image\\dice3.jpg'>",
		
		"<img src='C:\\Users\\504CLASS-18\\eclipse-workspace\\MyWebSite\\WebContent\\image\\dice4.jpg'>",
		
		"<img src='C:\\Users\\504CLASS-18\\eclipse-workspace\\MyWebSite\\WebContent\\image\\dice5.jpg'>"
		};

		String cube1="";
		String cube2="";

		
		int j;
		
		for(int i =0; i<cube.length; i++) {
	
		j=(int)(Math.random()*cube.length);

		cube1 = cube[j];

		
		}
		
		for(int i =0; i<cube.length; i++) {
			
			j=(int)(Math.random()*cube.length);

			cube2 = cube[j];

			
			}
		
		
		
		
		



		out.println("<!DOCTYPE>");

		out.println("<html>");

		out.println("<head>");
		
		out.println("</head>");

		out.println("<body>");
		

				
						
		
		out.println(a);

		out.println(cube1);
		
		out.println(cube2);

	
		out.println("<button>돌려주세요</button>");
		
		out.println("</body>");

		out.println("</html>");
		
		

		

		

		

		

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	
}
