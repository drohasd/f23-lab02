package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    private double getW(){
        return width;
    }
    private double getH(){
        return height;
    }
    public double getArea() {
        return getH() * getW();
    }
}
