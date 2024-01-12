
class Person{
    String name;
    int age;


    public String toString(){
        return this.name + " " + this.age;
    }

}

class Car{
    String make;
    String model;
    int year;

    public String toString(){
        return this.make + " " + this.model + " " + this.year;
    }
}

public class Main{

    public static void main(String [] args){

        Person p1 = new Person();
        p1.name = "Harshvardhan";
        p1.age = 21;

        System.out.println(p1.toString());

        Car c1 = new Car();
        c1.make = "Tata";
        c1.model = "Harrier";
        c1.year = 2019;

        System.out.println(c1.toString());

    }

}
