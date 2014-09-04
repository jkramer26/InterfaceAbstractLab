

package lab2;

/**
 *
 * @author jkramer26
 */
public class StartupClass_Lab2 {
    public static void main(String[] args) {
        
        //Instantiate an IntroToProgrammingCourse object
        Course programmingIntro = new IntroToProgrammingCourse("Intro to Programming", "P-123", 3);
        
        //Print out class information
        System.out.println("Course Name: " + programmingIntro.getCourseName()
                            + "\nCourse Number:" + programmingIntro.getCourseNumber()
                            + "\nCredits for Course: " + programmingIntro.getCredits());
        
        //Instantiate an IntrotoJavaCourse object
        //If I change the type it won't grab prereqs...no idea why
        //If I pass in a value does it get validated? - you have to call method in constructor to validate passed 
        //input right away
        IntroJavaCourse javaIntro = new IntroJavaCourse("Intro to Java", "P-224", 4, "Intro to Programming");
        
        System.out.println("\n\nCourse Name: " + javaIntro.getCourseName()
                            + "\nCourse Number:" + javaIntro.getCourseNumber()
                            + "\nCredits for Course: " + javaIntro.getCredits()
                            + "\nCourse Prereqs: " +javaIntro.getPrerequisites());
        
        //Instantiate and AdvancedJavaCourse object
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "P-448", 4, "Intro to Java");
        System.out.println("\n\nCourse Name: " + advancedJava.getCourseName()
                            + "\nCourse Number:" + advancedJava.getCourseNumber()
                            + "\nCredits for Course: " + advancedJava.getCredits()
                            + "\nCourse Prereqs: " +advancedJava.getPrerequisites());

    }
}
