
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mario
 */
public class main {

    public static void main(String[] args) {
        int count = 1;

        collage c1 = new collage(1, "SIM"); //defined

        Scanner test = new Scanner(System.in);
        do {

            System.out.println("1. Add a course.");
            System.out.println("2. Add a student.");
            System.out.println("3. Add a lecturer.");
            System.out.println("4. Register a course for a student.");
            System.out.println("5. Register a course for a lecturer.");
            System.out.println("6. Display collage information.");
            System.out.println("7. Display the complete list of courses.");
            System.out.println("8. Display the complete list of students.");
            System.out.println("9. Display the complete list of lecturers.");
            System.out.println("10. Display a list of courses currently taken by a particular student.");
            System.out.println("11. Display a list of courses currently taught by a particular lecturer.");
            System.out.println("12. Quit.");

            int choice = test.nextInt();
            switch (choice) {
                case 1:
                    

                    System.out.println("What is course ID ?");
                    int y = test.nextInt();
                    System.out.println("what course do you want to add ?");
                    String x = test.next();
                    course v = new course(y, x);
                    c1.addcourse(v);
                    System.out.println("courses added successfuly !");

                    break;
                case 2:
                    System.out.println("what is your student id ?");
                    int id = test.nextInt();
                    System.out.println("What is student name ?");
                    String name = test.next();
                    student s1 = new student(id, name);
                    c1.addstudent(s1);

                    break;
                case 3:
                    System.out.println("what is your lecturer id ?");
                    int lecturerid = test.nextInt();
                    System.out.println("What is lecturer name ?");
                    String lecturername = test.next();
                    lecturer r1 = new lecturer(lecturerid, lecturername);
                    c1.addlecturer(r1);

                    break;
                case 4:
                System.out.print("Enter courseID : ");
                int cID = test.nextInt();

                System.out.println("Enter StudentID : ");
                int Studentid = test.nextInt();
                for (int i = 0; i < c1.getCourse().size(); i++) {
                    course c = c1.getCourse().get(i);
                    if (cID == c.getID()) {

                        for (int j = 0; j < c1.getStudent().size(); j++) {
                            student s = c1.getStudent().get(j); 

                            if (s.getID() == (Studentid)) {
                                s.addc(c);
                                c.PNumofregisteredstudents();
                            }
                        }
                    }
                }
        

                    break;
                case 5:
                System.out.print("Enter courseID : ");
                int courseID = test.nextInt();

                System.out.println("Enter lecturerID : ");
                int lid = test.nextInt();
                for (int i = 0; i < c1.getCourse().size(); i++) {
                    course c = c1.getCourse().get(i);
                    if (courseID == c.getID()) {

                        for (int j = 0; j < c1.getLecturer().size(); j++) {
                            lecturer f= c1.getLecturer().get(j);

                            if (f.getID()== (lid)) {
                                f.addcourses(c);
                                c.setLecturer(f);
                            }
                        }
                    }
                }
      
                    break;
                case 6:
                    System.out.println("collage id :" + c1.getID());
                    System.out.println("collage name:" + c1.getName());

                    break;
                case 7:

                    System.out.println("available courses :" + c1.getCourse());

                    break;
                case 8:
                    System.out.println("list of the students :" + c1.getStudent());

                    break;
                case 9:
                    System.out.println("available lectureres :" + c1.getLecturer());
                    break;
                case 10:
                System.out.println("Enter StudentID : ");
                int Stuid = test.nextInt();
                for (int j = 0; j < c1.getStudent().size(); j++) {
                    student r = c1.getStudent().get(j);

                    if (r.getID() == (Stuid)) {
                        System.out.println(r.getCourses());
                    }
                }
                    break;
                case 11:
                System.out.println("Enter lecturerID : ");
                int Lid = test.nextInt();
                for (int j = 0; j < c1.getLecturer().size(); j++) {
                    lecturer r = c1.getLecturer().get(j);

                    if (r.getID() == (Lid)) {
                        System.out.println(r.getCrs());
                    }
                }

                    break;
                case 12:
                    count = 10;
                    System.out.println("END");
                    break;
                default:
                    System.out.println("Wrong choice. Try again!");
            }
        } while (count != 10);
    }
}
