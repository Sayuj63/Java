// ⁠Single-Level Inheritance
class Person {
    String name;
    String address;

    void getDetails(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class Student extends Person {
    String course;

    void getCourse(String course) {
        this.course = course;
    }

    void displayStudentInfo() {
        displayDetails();
        System.out.println("Course: " + course);
    }
}

public class SingleLevelExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.getDetails("Alice", "123 Main St");
        student.getCourse("Computer Science");
        student.displayStudentInfo();
    }
}