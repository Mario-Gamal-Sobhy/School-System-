


public class course extends identification {

    private lecturer Lecturer; //obj from the class lecture
    private int Numofregisteredstudents;

    public course() {
    }

    public course(int id, String coursename) {

        super(id, coursename);

    }

    public lecturer getLecturer() {
        return Lecturer;
    }

    public void setLecturer(lecturer Lecturer) {
        this.Lecturer = Lecturer;
    }

    public void PNumofregisteredstudents() {
        Numofregisteredstudents ++;
    }

//    public void setNumofregisteredstudents(int Numofregisteredstudents) {
//        this.Numofregisteredstudents = Numofregisteredstudents;
//    }

    @Override
    public String toString() {
        return "{" + "courseID=" + super.getID() + ", coursename=" + super.getName() + ", Lecturer=" + Lecturer + ", Numofregisteredstudents =" + Numofregisteredstudents + "}";
    }
}
