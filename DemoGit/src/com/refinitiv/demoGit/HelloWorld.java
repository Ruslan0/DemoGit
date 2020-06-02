package com.refinitiv.demoGit;

import java.io.*;
import java.util.Properties;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

private static final long serialVersionUID = -2473256499086594119L;
private String message;

public void init() throws ServletException {
   message = "Hello";
}

public String getName() throws FileNotFoundException, IOException {
   Properties props = new Properties();
   props.load(getServletContext().getResourceAsStream("/resources/demogit.properties"));
   return (WorkWithName.getName(props));	
}

public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {

   
   response.setContentType("text/html");

   PrintWriter out = response.getWriter();
   out.println("<h1>" +"Demo"+"</h1>");
   out.println("<h1>" + message + getName()+"!"+"</h1>");
}

public void destroy() {
}
}