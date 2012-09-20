/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Kyle Guzikowski
 * Done
 *
 * Programming Super Class
 *  common methods are final
 */
public abstract class ProgramingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public final double MIN_CREDITS = .5;
    public final double MAX_CREDITS = 4;



    public final String getCourseName() {
        return courseName;
    }
    public final double getCredits(){
        return credits;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }



    public final void setCourseName(String courseName){
          if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.courseName = courseName;
    }

    public final void setCourseNumber(String courseNumber){
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.courseNumber = courseNumber;
    }


    //all
    public final void setCredits(double credits){
        if (credits < MIN_CREDITS || credits > MAX_CREDITS) {
            throw new IndexOutOfBoundsException();

        }
        this.setCredits(credits);
    }


    public final String getPrerequisites() {
        return this.prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.prerequisites = prerequisites;

    }


    }

