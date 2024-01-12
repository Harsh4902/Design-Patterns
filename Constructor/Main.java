
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(12);
        Person p3 = new Person("Jatin");
        Person p4 = new Person("Vaibahv",20);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}

class Person{

    String name;
    int age;


    public Person(){

    }

    public Person(int age){
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+" Age: "+this.age;
    }

}
