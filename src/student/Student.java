package student;

public class Student {
    private String name;
    private int age;
    private Grade grade;

    public Student(String name, int age, Grade grade) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        if (grade == null) {
            throw new IllegalArgumentException("Grade cannot be null");
        }
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        if (grade == null) {
            throw new IllegalArgumentException("Grade cannot be null");
        }
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
