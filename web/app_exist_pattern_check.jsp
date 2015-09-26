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
    
    if(session.getAttribute("user_name")!=null){
        
           JSONObject json = new JSONObject();
           String isExisted=Click.checkUser((String)session.getAttribute("user_name"))+"";
     
          json.put("isExist",isExisted );
          
          System.out.println(isExisted);
       
         out.print(json);
              out.flush();;
        
    }else {
    
     response.sendRedirect(WebFuns.REDIRECT);
    }
        
        
        
        
        


    %>

