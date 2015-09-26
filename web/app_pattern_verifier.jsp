<%-- 
    Document   : app_register
    Created on : Jan 10, 2015, 9:17:37 PM
    Author     : aanas
--%>

<%@page import="com.WebFuns"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="com.Click"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



    <%
    
    if(session.getAttribute("user_name")!=null)
    {
    // consider checking  user name before saving the patter
        String pattern = request.getParameter("pattern");
        String username = (String)session.getAttribute("user_name");
        boolean check=Click.checkPattern(pattern, username);
        if (check) Click.clickIt();
        
          JSONObject json = new JSONObject();

            json.put("check", check);
            
              out.print(json);
              out.flush();;}
    else {
    
     response.sendRedirect(WebFuns.REDIRECT);
    }
        
        
        
        
        


    %>

