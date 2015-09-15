/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author johnny
 */
public abstract class Course {
    private double credits;
    private String courseName;
    private String courseNumber;
    
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract void setCourseName(String courseName);
    
    public abstract void setCredits(double credits);
    
    public final double getCredits(){
        return credits;
    
    }
    
    public final String getCourseName(){
        return courseName;
    }
    
    public final String getCourseNumber(){
        return courseNumber;
    }
    
    
    
    
}
