
package student;


public class Course {
    private  String courseName;
    private  int credits;

    public Course(String courseName, int credits) {
        if (courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be null or empty");
        }
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits must be positive");
        }
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }
}