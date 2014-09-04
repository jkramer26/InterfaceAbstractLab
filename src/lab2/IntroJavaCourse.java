package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements Course {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    //constructor 
    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
    
    //not prompting me to override?
    //get course name
    public String getCourseName() {
        return courseName;
    }
    //set course name
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    
    //gets course number
    public String getCourseNumber() {
        return courseNumber;
    }
    //sets course number
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    
    
    //gets course credits
    public double getCredits() {
        return credits;
    }
    //sets course credits
    public void setCredits(double credits) {
        this.credits = credits;
    }
    
    
    
    //gets course prereqs
    public String getPrerequisites() {
        return prerequisites;
    }
    //sets course prereqs
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    
}
