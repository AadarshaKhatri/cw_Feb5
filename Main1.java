import models.Employee;
import models.Manager;
import models.Member;

public class Main1 {
    public static void main(String[] args) {
        Member mb1 = new Member("Ram",24,98182341, 800);
        mb1.OverallSalary(4);
        mb1.giveinfo();

        Manager m1 = new Manager("Hari",42,983732,1200);
        m1.OverallSalary(7);
        m1.giveinfo(5);
        m1.giveinfo();

        Employee e1 = new Employee("Shaym",34,1284,100);
      e1.giveinfo();

    }
}
