package net.fernando.salas.association;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void learn() {
        System.out.println(name + " is learning from the teacher.");
    }
}

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void teach(Student student) {
        System.out.println(name + " is teaching " + student.getName());
    }
}

public class School {
    public static void main(String[] args) {
        // Create instances of Student and Teacher
        Student student1 = new Student("Fernando");
        Student student2 = new Student("Elsy");
        Teacher teacher = new Teacher("Mr. Salas");

        // Establish the association by having the teacher teach the students
        teacher.teach(student1);
        teacher.teach(student2);

        // Students learn from the teacher
        student1.learn();
        student2.learn();
    }
}
