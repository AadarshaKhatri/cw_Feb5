package models;

public class Circle {

    double radius;

    double pie;

    public Circle(double radius, double pie) {
        this.radius = radius;
        this.pie = pie;
    }
public void area(){
        double r = this.radius;
        double pi = this.pie;
        double area = pi*(r*r);
    System.out.println("The area of the give shape is"+area);
}
}
