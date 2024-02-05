package models;
import models.Circle;

public class Cylinder extends Circle {

    double height;

    public Cylinder(double radius, double pie, double height) {
        super(radius, pie);
        this.height = height;
    }

    public void areacylinder(){
        double h = this.height;
        double r = this.radius;
        double pi = this.pie;
        double a = 2*pi*r*h;
        System.out.println("The area of the cylinder is"+ a);

    }

    }
