/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home.project;

/**
 *
 * @author dzimi
 */
 public class Professor extends Person {
    private String department;

// Constructor for Professor with an additional department
    public Professor(String name, int age, String address, String department) {
        super(name, age, address);
        this.department = department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }

// An additional variable intended only for Professor
    public String teach() {
        return "Teaching  Java";
    }  
}
