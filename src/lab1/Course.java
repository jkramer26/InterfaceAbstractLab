/*
 * It's advantageous to use the Liskov princple when you have lots of different superclasses
 * and need to identify what subclasses belong to which superclasses
 * 
 * It's not really useful if you have just one superclass. It also seems to not work if 
 * you have subclass that is extended
 */

package lab1;

import javax.swing.JOptionPane;

/**
 * This is an abstract class
 * The course name and number are set in this class
 */

//the class is abstract
public abstract class Course { 
    private String courseName;     //made courseName private
    private String courseNumber;
    private double credits;
    
    //constructor that sets course name and course number which all courses will have
    //might want to consider only putting constructors in subclasses
    public Course(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }
    
    
    //this should stay final so it can't be overwritten
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    
    //setters and getters should be in superclass
    public double getCredits() {
        return credits;
    }
    
    //put setCredits in here
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    
    public String getCourseName() {
        return courseName;
    }
    
    //this should stay as is because all courses will have a name and shouldn't be altered
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}
