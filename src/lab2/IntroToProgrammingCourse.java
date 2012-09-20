package lab2;

import javax.swing.JOptionPane;

/**
 * class creates a Intro to programming with
 * Initialized parameters or fields  and it implements the JavaCourseInterface
 * with overridden methods
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements JavaCourseInterface {
    private static final double MIN_CRED = .05;
    private static final double MAX_CRED = 4;

    private String courseName = "Intro To Programming";
    private String courseNumber = "144-1";
    private double credits = 2.0;

    public IntroToProgrammingCourse() {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public final String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public final double getCredits() {
        return credits;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < MIN_CRED || credits > MAX_CRED) {
            throw new IllegalArgumentException();

        }
        this.credits = credits;
    }

    @Override
    public final String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }


}
