/*
 * Represents a graduate course with a research focus.
 */
package home.project;

import java.util.ArrayList;
import java.util.List;

// GraduateCourse class implementing the Course interface
 public class GraduateCourse implements Course {
    private String courseName; 
    private String courseCode;
    private String researchFocus; 
    private List<Person> participants; 

    // Constructor for initializing the course details
    public GraduateCourse(String courseName, String courseCode, String researchFocus) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.researchFocus = researchFocus;
         this.participants = new ArrayList<Person>();
       
    }

    // Method to get the course name
    @Override
    public String getCourseName() {
        return this.courseName;
    }

    // Method to get the course code
    @Override
    public String getCourseCode() {
        return this.courseCode;
    }

    // Method to add a participant to the course
     @Override
    public void addParticipant(Person person) {
      this.participants.add(person);
    }

    // Method to get the list of participants
    @Override
    public List<Person> getParticipants() {
        return this.participants;
    }

    // Method to get the research focus of the course
    public String getResearchFocus() {
        return this.researchFocus;
    }
}





