<%-- 
    Document   : notsecured
    Created on : Jun 11, 2015, 9:42:08 PM
    Author     : aanas
--%>
<%@page import="com.WebFuns"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="com.Click"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    if(session.getAttribute("user_name")!=null)
    {
             Click.clickIt();
        
          JSONObject json = new JSONObject();

            json.put("check", "True");
            
              out.print(json);
              out.flush();;}
    else {
    
     response.sendRedirect(WebFuns.REDIRECT);
    }
        
    
    %>