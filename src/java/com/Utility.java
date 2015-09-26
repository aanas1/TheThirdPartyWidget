/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.apache.catalina.Session;

/**
 *
 * @author aanas
 */
public class Utility {
    
    static String POINTS="Points";

    static int max_x=240;
    
    static int max_y=130;
    
   
     static int min_x=0;
    
    static int min_y=0;
   
    
    
    
    public static int randInt(int min, int max) {

    // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

    // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    

     public static int getRandX() {

    // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

    // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max_x - min_x) + 1) + min_x;

        return randomNum;
    }
    
     
         public static int getRandY() {

    // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

    // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max_y - min_y) + 1) + min_y;

        return randomNum;
    }
     

    public static String getRand() {

        return UUID.randomUUID().toString();
    }

    public static int getLastIndex(ArrayList<Point> points) {
        return points.size()-1;
    }
    
    /**
     *
     * @param Session
     * @return
     */
    public static boolean getLastPointValidationOfSessionPoints(HttpSession session)
    {
         ArrayList <Point> points=(ArrayList <Point>) session.getAttribute(POINTS);
     
        return  points.get(getLastIndex(points)).isVisited();
        
    }
    
    public static  ArrayList <Point>getPoints(HttpSession session){
    
    return (ArrayList <Point>) session.getAttribute(POINTS);
    }
    
    
    
    

}
