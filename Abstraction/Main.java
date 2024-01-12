
public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.sound();

        c.eat();
        c.sound();
        
    }
    
}

abstract class Animal{

    public abstract void eat();
    
    public abstract void sound();
}

class Cat extends Animal{

    @Override
    public void eat() {
        
        System.out.println("Cat eats catfood");
        
    }

    @Override
    public void sound() {
        
        System.out.println("Meow Meow...");
        
    }

}

class Dog extends Animal{

    @Override
    public void eat() {
        
        System.out.println("Dog eats dogfood");
        
    }

    @Override
    public void sound() {
        System.out.println("Bhow Bhow...");   
    }

}
