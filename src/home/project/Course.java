/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package home.project;

import java.util.List;

/**
 *
 * @author dzimi
 */

// Interface Course
public interface Course {
    // Returns the course name
    String getCourseName(); 
    
    // Returns the course code
    String getCourseCode(); 
    
    // Adds a participant to the course
    void addParticipant(Person person); 
    
    // Returns the list of participants in the course
    List<Person> getParticipants(); 
}



