/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sauce
 */
public class Circle extends Shape {
    
    private String name;
    private double radius;
    
    public Circle(String name){
        //this.name = name;
        super(name);
    }
    
    public void setDimensions(double radius){
        this.radius = radius;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Radius: " + this.radius);
    }
    
    @Override
    public double getArea(){
        return (3.14 * (this.radius * this.radius));
    }
}
