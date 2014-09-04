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
    private double credits;
    private String prerequisites;
    
    //constructor that sets course name
    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber);
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
    
    //returns credits for course
    public double getCredits() {
        return credits;
    }
    
    //not sure if this is done correctly seeing as it's not forcing me to override the superclass method
    //method that will set credits for the course
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
