/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home.project;

/**
 *
 * @author Elisheva
 */
// Abstract Class - Person
// An abstract class representing people (Student or Professor)
public abstract class Person {
   // Private attributes
    private String name;
    private int age;
    protected String address; // Accessible only to derived classes
    
     // Constructor of the class to receive name, age, and address
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods (returning values) for name, age, and address
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

// Abstract method to return the role (will be implemented in derived classes)
    public abstract String getRole();
}


