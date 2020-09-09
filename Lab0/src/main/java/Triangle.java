/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sauce
 */
import java.lang.Math;
public class Triangle extends Shape {
    
    private String name;
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(String name){
        //this.name = name;
        super(name);
    }
    
    public void setDimensions(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Side 1: " + this.side1 + " Side 2: " + this.side2 + " Side 3: " + this.side3);
    }
    
    @Override
    public double getArea(){
        double perimeter = this.side1 + this.side2 + this.side3;
        double s = perimeter / 2;
        return (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
    }
}
