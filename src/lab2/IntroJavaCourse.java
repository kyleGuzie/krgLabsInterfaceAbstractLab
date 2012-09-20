package lab2;

/**
 * class creates a IntroToJava object
 * Initialized parameters or fields  and it implements the JavaCourseInterface
 * with overridden methods
 *
 * @author Kyle Guzikowski
 * @version 1.01
 */
public class IntroJavaCourse implements JavaCourseInterface {
    private static final double MIN_CRED = .05;
    private static final double MAX_CRED = 4;

    private String courseName = "Intro To Java";
    private String courseNumber = "144-2";
    private double credits = 3.0;
    private String prerequisites = "Intro To Programming";

    public IntroJavaCourse() {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);

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

    /**
     *
     * @return
     */
    @Override
    public final double getCredits() {
        return credits;
    }

    /**
     *
     * @param credits
     */
    @Override
    public final void setCredits(double credits) {
            if(credits < MIN_CRED || credits > MAX_CRED) {
            throw new IllegalArgumentException();

        }
        this.credits = credits;

    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
                if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public final String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.courseName = courseName;
    }
}
