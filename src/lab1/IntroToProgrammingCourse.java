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
    private double credits;
    
    //constructor that sets course name
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber);
        this.credits = credits;
    }
    
    //not sure if this should be in superclass or subclass
    //public double getCredits() {
    //    return credits;
    //}
    
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

    public double getCredits() {
        return credits;
    }
    
    
    
}
