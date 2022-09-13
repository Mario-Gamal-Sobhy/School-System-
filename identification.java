/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class identification {
    
   protected int ID;
    protected String name;
    public static int lecturers = 0;
     

    public identification() {
    }

    public identification(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
}
