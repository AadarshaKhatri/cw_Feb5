package models;

import java.util.Scanner;

public class Member {

    String name;
    int age;
    int contact;
    int Salary;

    public Member(String name, int age, int contact, int salary) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        Salary = salary;
    }

    public void OverallSalary(int leave) {
        int s = this.Salary;
        int total_Salary = 24* s - leave*s;
        System.out.println("Your total salary fot this month is " + total_Salary);


    }
    public void giveinfo(){
        String name = this.name;
        int age = this.age;
        System.out.println("Name:"+name+"\n"+"Age: "+age);
    }
}


