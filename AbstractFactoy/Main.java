
public class Main {
    public static void main(String[] args) {
        AbstractFactory f1 = new ConcreteFactory1();
        f1.creatProductA();
        f1.creatProductB();

        AbstractFactory f2 = new ConcreteFactory2();
        f2.creatProductA();
        f2.creatProductB();
    }
}

abstract class AbstractFactory{

    abstract ProductA creatProductA();
    abstract ProductB creatProductB();
}

interface ProductA{
    void build();
}
interface ProductB{
    void build();
}

class ConcreteFactory1 extends AbstractFactory{
    @Override
    ProductA creatProductA() {
        return new ProductA1();
    }
    @Override
    ProductB creatProductB() {
        return new ProductB1();
    }
}

class ConcreteFactory2 extends AbstractFactory{
    @Override
    ProductA creatProductA() {
        return new ProductA2();
    }
    @Override
    ProductB creatProductB() {
        return new ProductB2();
    }
}

class ProductA1 implements ProductA{

    public ProductA1(){
        build();
    }

    @Override
    public void build() {
        System.out.println("Building ProductA1.....");
    }
}

class ProductA2 implements ProductA{

    public ProductA2(){
        build();
    }

    @Override
    public void build() {
        System.out.println("Building ProductA2.....");
    }
}

class ProductB1 implements ProductB{

    public ProductB1(){
        build();
    }

    @Override
    public void build() {
        System.out.println("Building ProductB1.....");
    }
}

class ProductB2 implements ProductB{
    
    public ProductB2(){
        build();
    }
    
    @Override
    public void build() {
        System.out.println("Building ProductB2.....");
    }
}