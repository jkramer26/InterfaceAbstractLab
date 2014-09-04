/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    public Course(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
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
    
    //should set or get be the abstract method
    //and if set is the abstract method should get remain in superclass?
    public abstract double getCredits();
    
    //change this to an abstract method and then allow subclasses to handle setting credits
    //why doesn't this have to be there
    //public abstract void setCredits(double credits);
    

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

    void getPrequisites() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
