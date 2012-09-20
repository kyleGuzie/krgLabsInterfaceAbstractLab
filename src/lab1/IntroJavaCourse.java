package lab1;

import javax.swing.JOptionPane;

/**
 * Done
 * Describe responsibilities here.
 *
 * @author Kyle Guzikowski
 * @version 1.01
 */
public class IntroJavaCourse extends ProgramingCourse {

    private String courseName = "Intro to Java Programing";
    private String courseNumber = "152-2";
    private double credits = 2.0;
    private String prerequisites = "Intro To Programming";

    public IntroJavaCourse() {
        this.setCourseNumber(courseNumber);
        this.setCourseName(courseName);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);

    }


}