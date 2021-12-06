package com;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

import java.io.*;

 


/**
 * Servlet implementation class RequestExample
 */
@WebServlet("/RequestExample")
public class Requestexample extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public void doGet(HttpServletRequest req,HttpServletResponse res)  
            throws ServletException,IOException  
            {  
            res.setContentType("text/html");  
            PrintWriter pw=res.getWriter();  
              
            String firstname=req.getParameter("firstname");//will return value
            String lastname=req.getParameter("lastname");
            String Location=req.getParameter("Location");
            String PhoneNumber=req.getParameter("PhoneNumber");
            
            pw.println("Hiii "+firstname);
            pw.println("Your Last Name is==  "+lastname);
            pw.println("Your last location is==  "+Location);
            pw.println("your phone number is== "+PhoneNumber);
              
            pw.close();  
            }
    
    
    public Requestexample() {
        super();
        // TODO Auto-generated constructor stub
    }

 

}