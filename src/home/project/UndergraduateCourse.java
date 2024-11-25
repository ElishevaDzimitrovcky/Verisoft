/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home.project;


/**
 *
 * @author dzimi
 */

import java.util.ArrayList;
import java.util.List;

// Bachelor's Course class that implements the Course
 public class UndergraduateCourse implements Course {
     
    private String courseName; 
    private String courseCode; 
    private List<Person> participants;

// Constructor for the Bachelor's Course class
 public UndergraduateCourse(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.participants = new ArrayList<Person>(); // אתחול הרשימה
    }

// Method to return the course name
    @Override
    public String getCourseName() {
        return this.courseName;
    }

// Method to return the course code
    @Override
    public String getCourseCode() {
        return this.courseCode;
    }

// Method to add a participant to the course
    @Override
    public void addParticipant(Person person) {
       this.participants.add(person);
    }

// Method to return the list of participants in the course
    @Override
    public List<Person> getParticipants() {
        return this.participants;
    }
}


