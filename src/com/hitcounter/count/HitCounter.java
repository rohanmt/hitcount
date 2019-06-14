package com.hitcounter.count;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HitCounter")
public class HitCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int hitCount;
	public void init() 
	{
		hitCount=0;
	}
    public HitCounter() {
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 // Set response content type
		 response.setContentType("text/html");
		 
		  // This method executes whenever the servlet is hit 
	      // increment hitCount 
	      hitCount++; 
	      PrintWriter out = response.getWriter();
	      out.println(	"<html>\n" +
	    		  		"<h2 align = \"center\">Total Hits	" + hitCount + "</h2>\n" +
	    		  		"</body></html>"
	    		  	);
	   }
	   
	   public void destroy() { 
	      // This is optional step but if you like you
	      // can write hitCount value in your database.
	   } 
	}
