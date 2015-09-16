/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author johnny
 */
public class StartUp {
    
    public static void main(String[] args){
        
        // I like the interface structure because it was a lot less code to write to get the interface to implement with the other subclasses, and i know what methods are being inherited because they are being redeclared in the classes
        // I dislike not being able to use concrete methods and that you have to redeclare all of the methods which is time consuming
        
        
        
        // Liskov Substitution principle
        // Should only be used if the methods of the subclasses are the same otherwise you can't use substitution principle and should call the class by itself
        
        
        
        AdvancedJavaCourse first = new AdvancedJavaCourse("Java: The Code of the World","JCOW453");
        
        IntroJavaCourse second = new IntroJavaCourse("Java: You better learn this!","J101");
        
        Course third = new IntroToProgrammingCourse("Intro to Programming: Code made Easy","IP890");
        
        System.out.println("Here is your course list for the semester");
        System.out.println("CLass 1: " + first.getCourseName() + " and it is course number: " + first.getCourseNumber() );
        System.out.println("CLass 2: " + second.getCourseName() + " and it is course number: " + second.getCourseNumber());
        System.out.println("CLass 3: " + third.getCourseName() + " and it is course number: " + third.getCourseNumber());
        
        
        
        
    }
    
    
    
    
    
}
