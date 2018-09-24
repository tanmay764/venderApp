package com.nt.voter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VotterApp extends HttpServlet {
    String name=null,tage=null,vstatus=null;
    int age=0;
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
       res.setContentType("text/html");
       PrintWriter pw=res.getWriter();
       name=req.getParameter("pname");
       tage=req.getParameter("page");
       vstatus=req.getParameter("vflag");
       if(vstatus.equals("no")){
    	   if(name.equals("")||name.equals(null)||name.length()==0){
    		   pw.println("<font color=red>persion age is mandetory</font>");
    		   return;
    	   }
    	   if(tage.equals("")||tage.equals(null)||tage.length()==0){
    		   pw.println("<font color:red>age is mandetory</font>");
    		   return;
    	   }
    	   else{
    		   try{
    		   age=Integer.parseInt(tage);
    		   }catch(NumberFormatException e){
    			   pw.println("<font color:red>Age must be number</font>");
    		   }
    	   }
    	  
       }
       else{
              age=Integer.parseInt(tage);   	   
       }
    		    
    if(age>=18){
    	pw.println("<font color:green>You are eleggible for voting</font>");
    }
    else{
    	pw.println("<font color:green>You are NOTeleggible for voting</font>");

    }
    pw.close();
    }

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req,res);
	}
    
}
