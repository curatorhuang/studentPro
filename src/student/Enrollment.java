package student;

public class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null");
        }
        this.student = student;
        this.course = course;
    }

    public void printEnrollmentDetails() {
        System.out.println("Student: " + student.getName() + " is enrolled in " + course.getCourseName());
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}
