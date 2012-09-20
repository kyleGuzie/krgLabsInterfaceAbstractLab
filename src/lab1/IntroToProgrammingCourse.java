package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * IntroToProgramingClass
 * Done
 *
 * Inheritance all methods from  Programming Course
 *
 * @author Kyle Guzikowski
 * @version 1.01
 */
public class IntroToProgrammingCourse extends ProgramingCourse {

    // private properties public methods
    //made them static because only one type of class with that course number should be made
    //
    private String courseName = "Intro To Programing";
    private String courseNumber = "154-1";
    private double credits = 3.0;
    private String prerequisites = "None";

    //custom constructor for class
    public IntroToProgrammingCourse() {

        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);

    }


}
