

import java.util.ArrayList;

public class student extends identification{

 
    private ArrayList<course> courses = new ArrayList<course>();
    

    public student() {
    }

    public student(int id, String studentname) {
        super(id,studentname);
    }
    

    
    public ArrayList<course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<course> courses) {
        this.courses = courses;
    }
    public void addc(course e){
        courses.add(e);
    }

    @Override
    public String toString() {
        return "{" +"student id"  + super.getID()+ ", studentname=" + super.getName() + ", courses=" + courses.size() + '}';
    }
    

}
