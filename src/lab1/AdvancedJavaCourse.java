package lab1;

/**done
 * Describe responsibilities here.
 * redeclared properties
 * extended superclass;
 *
 *
 * @author      Kyle Guzikowski
 * @version     1.01
 */
public class AdvancedJavaCourse extends ProgramingCourse {

    private String courseName = "Advanced Java";
    private String courseNumber = "154-3";
    private double credits = 4.0;
    private String prerequisites = "Intro to Java 152-2";

    public AdvancedJavaCourse() {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }




}

