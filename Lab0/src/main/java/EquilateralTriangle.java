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
public class EquilateralTriangle extends Triangle {
    
    private String name;
    private double side;
    
    public EquilateralTriangle(String name){
        //this.name = name;
        super(name);
    }
    
    public void setDimensions(double side){
        this.side = side;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Side : " + this.side);
    }
    
    @Override
    public double getArea(){
        double perimeter = this.side * 3;
        double s = perimeter / 2;
        return (Math.sqrt(s*(s-side)*(s-side)*(s-side)));
    }
}
