
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class collage extends identification  {

   
    
    private ArrayList<course> Course = new ArrayList<course>(); //assosiation relationship
    private ArrayList<student> Student = new ArrayList<student>();//assosiation relationship
    private  ArrayList<lecturer> lectureR = new ArrayList<lecturer>();//assosiation relationship

    public collage() {

    }

    public collage(int collageID, String collagename) {
        super(collageID, collagename);

    }

    public ArrayList<course> getCourse() {
        return Course;
    }

    public void setCourse(ArrayList<course> course) {
        this.Course = course;
    }

    public ArrayList<student> getStudent() {
        return Student;
    }

    public void setStudent(ArrayList<student> student) {
        this.Student = student;
    }

    public void setLecturer(ArrayList<lecturer> lecturer) {
        this.lectureR = lecturer;
    }

    public ArrayList<lecturer> getLecturer() {
        return lectureR;
    }

    public void addcourse(course c) {
        Course.add(c);

    }

    public void addlecturer(lecturer l) {
        lectureR.add(l);
    }

    public void addstudent(student s) {
        Student.add(s);

    }

   @Override
    public String toString() {
        return "{" + "collageID=" +super.getID()+ ", collagename=" +super.getName()  + ", course=" + Course.size()+ ", student=" + Student.size() + ", lecturer=" + lectureR.size() + '}';
    }


    
}
