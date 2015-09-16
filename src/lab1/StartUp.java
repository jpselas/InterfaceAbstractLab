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
public class StartUp {
    
    public static void main(String[] args) {
        
        // Advantagoeus for when you want to create an array of different objects also needed for polymorphism
        // Disadvantage if you are not using abstract class or interface and if you have other methods that are unique to the class you can't use the substitution
        
        
        AdvancedJavaCourse first = new AdvancedJavaCourse("Java: Advanced Programming","AJ234",4,"Java 101");
        
        IntroJavaCourse second = new IntroJavaCourse("Java 101","I455",3,"Programming for Dummies");
        
        Course third = new IntroToProgrammingCourse("Programming for Dummies","PD567",5);
        
        System.out.println("Here is your course list for the semester");
        System.out.println("CLass 1: " + first.getCourseName() + " and it is course number: " + first.getCourseNumber() + " it has "+first.getPrerequisites()+" as a prerequisite"+ " and is worth " +first.getCredits()+ " credits" );
        System.out.println("CLass 2: " + second.getCourseName() + " and it is course number: " + second.getCourseNumber());
        System.out.println("CLass 3: " + third.getCourseName() + " and it is course number: " + third.getCourseNumber());
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
