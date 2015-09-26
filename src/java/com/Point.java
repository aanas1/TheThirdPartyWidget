package com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aanas
 */
public class Point {

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    
    int x;
    int y;
    String id;
    boolean visited;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.id=Utility.getRand();;
    }

    public Point() {
        
        x=Utility.getRandX();
        y=Utility.getRandY();
        this.id=Utility.getRand();;
        
        System.err.println(x+","+y);
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
