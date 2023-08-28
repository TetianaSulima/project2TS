/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ractangleng;

/**
 *
 * @author navat
 */
public class Ractangle {
    double width;
    double length;

    public Ractangle() {
    }
    
    public Ractangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Ractangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    public double Area(){
        double area = this.length * this.length;
        return area;
    }
    
    public double Perimether(){
        double peri = (this.length * this.width)*2;
        return peri;
    }
}
