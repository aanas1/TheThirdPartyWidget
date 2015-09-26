<%-- 
    Document   : user_registration
    Created on : May 28, 2015, 9:26:11 PM
    Author     : aanas
--%>

<%@page import="org.json.simple.JSONObject"%>
<%@page import="com.Click"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <%
       // consider checking  user name before saving the patter
        String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");
        
        boolean isSaved =Click.saveUser(user_name, password);
        
       if (isSaved){
       
       out.print("User Registration Success, <a href=\"login.html\">login</a>  ");
       
       }else out.print("User Registration failed" );
        
 
    %>