<%-- 
    Document   : login
    Created on : May 27, 2015, 9:30:57 AM
    Author     : aanas
--%>

<%@page import="org.json.simple.JSONObject"%>
<%@page import="com.Click"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
         // consider checking  user name before saving the patter
        String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");
        boolean check=Click.validateUser(user_name, password );
        
        JSONObject json = new JSONObject();
       // json.put("check", check);
        
        if (check)
        { 
       session.setAttribute("user_name", user_name);
            
        out.print("login Success, please click <a href=\"index.html\">here</a> to proceede with the payment using default random pattern");
    
        out.print("<br>login Success, please click <a href=\"index_text_bg.html\">here</a> to proceede with the payment using  random pattern with back-ground..");
        
        out.print("<br>login Success, please click <a href=\"action_pattern.html\">here</a> to proceede with the payment using presistant pattern..");
    
        }else {
        out.print("login Failed, please click here to <a href=\"login.html\">here</a>..  ");
        
        
        }
          
           // out.print(json);
              out.flush();;
     


        %>
    </body>
</html>
