
import java.util.Scanner;
import java.util.Set;

public class main {
    Shape shape = new Shape("The Shape");
    Square square = new Square("The Square");
    Circle circle = new Circle("The Circle");
    Triangle triangle = new Triangle("The Triangle");
    EquilateralTriangle equilateral = new EquilateralTriangle("The Equilateral");
    
    
    public static void main(String[] args){
        main Main = new main();
        Main.run();
    }
    
    public void run(){
       
        Scanner input = new Scanner(System.in);
        
        //Square
        System.out.println("Enter Square length: ");
        double length = input.nextDouble();
        System.out.println("Enter Square height: ");
        double height = input.nextDouble();
        square.setDimensions(length, height);
        
        //Circle 
        System.out.println("Enter Circle radius: ");
        double radius = input.nextDouble();
        circle.setDimensions(radius);
        
        //Triangle
        System.out.println("Enter Traingle Side 1: ");
        double side1 = input.nextDouble();
        System.out.println("Enter Traingle Side 2: ");
        double side2 = input.nextDouble();
        System.out.println("Enter Traingle Side 3: ");
        double side3 = input.nextDouble();
        triangle.setDimensions(side1, side2, side3);
        
        //Equilateral
        System.out.println("Enter Equilateral Side: ");
        double side = input.nextDouble();
        equilateral.setDimensions(side);
        
        //Display
        System.out.println(square.getName() + " has dimensions of ");
        square.printDimensions();
        System.out.println(" and an area of " + square.getArea());
        
        System.out.println(circle.getName() + " has dimensions of ");
        circle.printDimensions();
        System.out.println(" and an area of " + circle.getArea());
        
        System.out.println(triangle.getName() + " has dimensions of ");
        triangle.printDimensions();
        System.out.println(" and an area of " + triangle.getArea());
        
        System.out.println(equilateral.getName() + " has dimensions of ");
        equilateral.printDimensions();
        System.out.println(" and an area of " + equilateral.getArea());
        
        
        
    }
}
