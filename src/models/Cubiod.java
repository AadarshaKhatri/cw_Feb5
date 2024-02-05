package models;
import models.Rectangle;

public class Cubiod extends Rectangle {
    double heightl;

    public Cubiod(double length, double breadth, double heightl) {
        super(length, breadth);
        this.heightl = heightl;
    }

    public void areacubiod(){
        double l = this.length;
        double b =this.breadth;
        double h = this.heightl;
        double total = l*b + l*h +h*b;
        double a = 2 * total;
        System.out.println("The area is"+ a);
    }
}
