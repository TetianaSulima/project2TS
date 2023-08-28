/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author navat
 */
public class Instructors {
    int iid;
    String iname; 

    public Instructors(int iid, String iname) {
        this.iid = iid;
        this.iname = iname;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    @Override
    public String toString() {
        return "Instructors{" + "iid=" + iid + ", iname=" + iname + '}';
    }
    
    
}
