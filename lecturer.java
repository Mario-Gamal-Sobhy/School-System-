
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
public class lecturer extends identification {

   
    private ArrayList<course> courses = new ArrayList<course>();

    public lecturer() {

    }

    public lecturer(int lecturerID, String lecturername) {
        super(lecturerID, lecturername);

    }

    public void setCourses(ArrayList<course> courses) {
        this.courses = courses;
    }

    public void addcourses(course c) {
        courses.add(c);
    }
    public ArrayList<course> getCrs() {
        return courses;
    }
    @Override
    public String toString() {
        return "{" + "lecturerID=" + super.getID() + ", lecturername=" + super.getName() + ", courses=" + courses.size() + '}';
    }

}
