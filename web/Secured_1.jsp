<%@page import="com.Utility"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.Point"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Click"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String authString = request.getParameter("auth");
    String pointId = request.getParameter("id");
    System.out.println("point id=>" + pointId);

    ArrayList<Point> points = new ArrayList();
    int authDone = 0;
    int i = 0;
    if (authString != null) {
        if (authString.equalsIgnoreCase("req")) {

            System.out.println("entered auth function");

            points.add(new Point());
            points.add(new Point());
            points.add(new Point());
            points.add(new Point());
            points.add(new Point());

            session.setAttribute("Points", points);
            JSONObject json = new JSONObject();

            json.put("len", 2);

            json.put("x1", points.get(0).getX());
            json.put("y1", points.get(0).getY());
            json.put("r1", points.get(0).getId());

            json.put("x2", points.get(1).getX());
            json.put("y2", points.get(1).getY());
            json.put("r2", points.get(1).getId());

            out.print(json);

            System.out.println(json);
            out.flush();

        } else if (authString.equalsIgnoreCase("id")) {
            System.out.println("entered else if with id, point size " + points.size() + "i is" + i);

            for (i = 0; i < ((ArrayList<Point>) session.getAttribute("Points")).size(); i++) {
                if ((((ArrayList<Point>) session.getAttribute("Points")).get(i).isVisited() == false)) {
                    if (((ArrayList<Point>) session.getAttribute("Points")).get(i).getId().equalsIgnoreCase(pointId)) {
                        ((ArrayList<Point>) session.getAttribute("Points")).get(i).setVisited(true);
                        
                        
                      
                        
                        if ((i+2<Utility.getPoints(session).size())){
                         JSONObject json = new JSONObject();
                        json.put("len", 1); 
                        
                        json.put("x", ((ArrayList<Point>) session.getAttribute("Points")).get(i + 2).getX());
                        json.put("y", ((ArrayList<Point>) session.getAttribute("Points")).get(i + 2).getY());
                        json.put("r", ((ArrayList<Point>) session.getAttribute("Points")).get(i + 2).getId());
                        out.print(json);
                        System.out.println(json);
                        out.flush();}

                    }

                }

            }

            }

        }
    

    if (Utility.getLastPointValidationOfSessionPoints(session)){
     
        Click.clickIt();
    }

%>