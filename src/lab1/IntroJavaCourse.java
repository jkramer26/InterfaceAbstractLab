package lab1;

import javax.swing.JOptionPane;

/**
 * This is a concrete class that inherits from the superclass Course
 * The number of credits & prerequisites are set within this class
 *
 * @author      your name goes here
 * @version     1.00
 */

//extend this class
public class IntroJavaCourse extends Course {
    private String prerequisites;
    
    //constructor that sets course name
    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits);
        this.prerequisites = prerequisites;
    }
    
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
