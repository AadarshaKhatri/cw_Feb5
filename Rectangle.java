package models;

public class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void arearect(){
        double l = this.length;
        double b =this.breadth;
        double area = l*b;
        System.out.println("The area is"+ area);
    }
}
