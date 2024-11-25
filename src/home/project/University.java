/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package home.project;

/**
 *
 * @author dzimi
 */
// University Class
public class University {
    public static void main(String[] args) {
// Creating objects for students and professors
        Student student1 = new Student("John", 20, "123 Main St", "S12345");
        Student student2 = new Student("Jane", 22, "456 Oak St", "S12346");
        Professor professor = new Professor("Dr. Smith", 45, "789 Elm St", "Computer Science");

// Creating courses
        UndergraduateCourse undergradCourse = new UndergraduateCourse("Intro to Java", "CS101");
        GraduateCourse gradCourse = new GraduateCourse("Advanced Java", "CS501", "Artificial Intelligence");

// Adding participants to courses
        undergradCourse.addParticipant(student1);
        undergradCourse.addParticipant(student2);
        gradCourse.addParticipant(student2);
        gradCourse.addParticipant(professor);

// Displaying course participants
        System.out.println("Undergraduate Course Participants:");
        for (Person person : undergradCourse.getParticipants()) {
            String doing;
            if(person instanceof Student){
                doing = ((Student) person).study();
            }
            else if (person instanceof Professor){
                doing = ((Professor) person).teach();
            }
            else{
                doing ="";
            }
            System.out.println(person.getName() + " is " + person.getRole() + " and I do: " + doing);
        }

        System.out.println("\nGraduate Course Participants:");
        for (Person person : gradCourse.getParticipants()) {
            String doing;
            if(person instanceof Student){
                doing = ((Student) person).study();
            }
            else if (person instanceof Professor){
                doing = ((Professor) person).teach();
            }
            else{
                doing = "";
            }
            System.out.println(person.getName() + " is " + person.getRole() + " and I do: " + doing  );
        }
    }
}

