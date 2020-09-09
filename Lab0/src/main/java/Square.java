/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sauce
 */
public class Square extends Shape {
    
    private String name;
    private double length;
    private double height;
    
    public Square(String name){
        //this.name = name;
        super(name);
    }
    
    public void setDimensions(double length, double height){
        this.length = length;
        this.height = height;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Length: " + this.length + " Height: " + this.height);
    }
    
    @Override
    public double getArea(){
        return this.length * this.height;
    }
}
