/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home.project;

/**
 *
 * @author dzimi
 */
// Student Class - Inherits from Person
// A student class that inherits from Person
 public class Student extends Person {
     
    private String studentId;  // Student Number
    
// Constructor for Student
    public Student(String name, int age, String address, String studentId) {
        super(name, age, address); // Calling the constructor of the abstract class
        this.studentId = studentId;
    }

    // Return the student's role
    @Override
    public String getRole() {
        return "Student"; // Student's role
    }

// Method to return the field of study
    public String study() {
        return "Studying for exams";
    }
}


