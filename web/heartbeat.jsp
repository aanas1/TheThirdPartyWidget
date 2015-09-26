<%-- 
    Document   : heartbeat
    Created on : May 30, 2015, 9:53:29 PM
    Author     : aanas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Utility"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.Point"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Click"%>
<%@page import="org.json.simple.JSONObject"%>

<%

    JSONObject json = new JSONObject();
    if (session.getAttribute("user_name") != null) {

        System.out.print("existed user name---------------->" + session.getAttribute("user_name"));

        json.put("user_name", session.getAttribute("user_name"));

    } else {
        System.out.print("not found");
        json.put("user_name", "404");
    }

    System.out.print(session.getAttribute(json.toJSONString()));

    out.print(json);

    out.flush();

%>
