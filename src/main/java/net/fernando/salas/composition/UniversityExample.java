package net.fernando.salas.composition;

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Professor> professors;


    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void listProfessors() {
        System.out.println("Professors in the " + name + " Department:");
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }
}

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void listDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println(department.getName());
            department.listProfessors();
            System.out.println();
        }
    }
}

public class UniversityExample {
    public static void main(String[] args) {
        University myUniversity = new University("My University");

        Department csDepartment = new Department("Computer Science");
        csDepartment.addProfessor(new Professor("Dr. Smith"));
        csDepartment.addProfessor(new Professor("Dr. Salas"));

        Department mathDepartment = new Department("Mathematics");
        mathDepartment.addProfessor(new Professor("Dr. Brown"));

        myUniversity.addDepartment(csDepartment);
        myUniversity.addDepartment(mathDepartment);

        myUniversity.listDepartments();
    }
}
