package PracticeExercises3;

public class Class_Methods2 {
    public static void main(String[] args) {

    	// Activity: Create a Simple "Student" Class
    	Student stud1 = new Student("Jasmin Lorino", 18, "2024-1002436");
        Student stud2 = new Student("Lucky Babes", 10, "2024-1002437");

        stud1.introduce();
        System.out.println("Is adult? " + stud1.isAdult());
        System.out.println();

        stud2.introduce();
        System.out.println("Is adult? " + stud2.isAdult());
    }
}

class Student {
    String name;
    int age;
    String studentID;

    Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    void introduce() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
    }

    boolean isAdult() {
        return age >= 18;
    }
}