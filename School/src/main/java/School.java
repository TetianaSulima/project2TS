
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author navat
 */
public class School {
    int number; 
    ArrayList<Students> st = new ArrayList();
    ArrayList<Instructors> inst = new ArrayList();

    public School(int number, ArrayList<Students> st, ArrayList<Instructors> inst) {
        this.number = number;
        this.inst = inst;
        this.st = st;
    }

    public School() {
    }
    

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Students> getSt() {
        return st;
    }

    public void setSt(ArrayList<Students> st) {
        this.st = st;
    }

    public ArrayList<Instructors> getInst() {
        return inst;
    }

    public void setInst(ArrayList<Instructors> inst) {
        this.inst = inst;
    }

    @Override
    public String toString() {
        return "School{" + "number=" + number + ", st=" + st + ", inst=" + inst + '}';
    }

 
    
    
}
