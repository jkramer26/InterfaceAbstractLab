package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 * 
 * This is a concrete class that inherits from the superclass Course.
 * This class will set the number of credits from the course 
 *
 * @author      Jessica Kramer
 * @version     1.00
 */

 
public class IntroToProgrammingCourse extends Course {
  
    //constructor that sets course name
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }
    
}
