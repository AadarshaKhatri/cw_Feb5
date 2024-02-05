import models.Circle;
import models.Cubiod;
import models.Cylinder;
import models.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.5,3.14);
        circle1.area();

        Cylinder cy1 = new Cylinder(5.5,3.14,12);
        //System.out.println(cy1);


        Rectangle rect1 = new Rectangle(5.6,6.45);
        rect1.arearect();

        Cubiod cub1 = new Cubiod(4.3,3.2,1.2);
        cub1.areacubiod();
    }
}
