//  Multi-Level Inheritance

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

class GraduateStudent extends Student {
    String researchTopic;

    void getResearchTopic(String topic) {
        this.researchTopic = topic;
    }

    void displayGraduateInfo() {
        displayStudentInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class MultiLevelExample {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent();
        gradStudent.getDetails("Bob", "456 Elm St");
        gradStudent.getCourse("Data Science");
        gradStudent.getResearchTopic("Artificial Intelligence");
        gradStudent.displayGraduateInfo();
    }
}