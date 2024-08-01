package student;

public class StudentDemo {

    public static void main(String[] args) {
        Student student1 = new Student("John", 20, Grade.A);
        Course course1 = new Course("Math", 3);
        Enrollment enrollment1 = new Enrollment(student1, course1);

        student1.printDetails();
        enrollment1.printEnrollmentDetails();

        // 逻辑错误：学生姓名无法直接访问，Enrollment类中的getName()应修改为student.getName()
        System.out.println("Enrolled student name: " + enrollment1.getStudent().getName());
    }
}
