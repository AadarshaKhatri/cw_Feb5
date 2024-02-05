package models;

public class Manager extends Member {
    public Manager(String name, int age, int contact, int salary) {
        super(name, age, contact, salary);
    }

    public void giveinfo(int Specilization){
        String n = this.name;
        int age =this.age;
        System.out.println("Your name is"+n+"\n"+"Age:"+"\n"+Specilization);


    }
}



