
public class Main {
    public static void main(String[] args) {
        AbstractFactory f1 = new ConcreteFactory1();
        f1.creatModernFurniture();
        f1.creatVictorianFurniture();

        AbstractFactory f2 = new ConcreteFactory2();
        f2.creatModernFurniture();
        f2.creatVictorianFurniture();
    }
}

abstract class AbstractFactory{

    abstract ModernFurniture creatModernFurniture();
    abstract VictorianFurniture creatVictorianFurniture();
}

interface ModernFurniture{
    void build();
}
interface VictorianFurniture{
    void build();
}

class ConcreteFactory1 extends AbstractFactory{
    @Override
    ModernFurniture creatModernFurniture() {
        return new ModernFurniture1();
    }
    @Override
    VictorianFurniture creatVictorianFurniture() {
        return new VictorianFurniture1();
    }
}

class ConcreteFactory2 extends AbstractFactory{
    @Override
    ModernFurniture creatModernFurniture() {
        return new ModernFurniture2();
    }
    @Override
    VictorianFurniture creatVictorianFurniture() {
        return new VictorianFurniture2();
    }
}

class ModernFurniture1 implements ModernFurniture{

    public ModernFurniture1(){
        build();
    }

    @Override
    public void build() {
        System.out.println("Building ModernFurniture1.....");
    }
}

class ModernFurniture2 implements ModernFurniture{

    public ModernFurniture2(){
        build();
    }

    @Override
    public void build() {
        System.out.println("Building ModernFurniture2.....");
    }
}

class VictorianFurniture1 implements VictorianFurniture{

    public VictorianFurniture1(){
        build();
    }

    @Override
    public void build() {
        System.out.println("Building VictorianFurniture1.....");
    }
}

class VictorianFurniture2 implements VictorianFurniture{
    
    public VictorianFurniture2(){
        build();
    }
    
    @Override
    public void build() {
        System.out.println("Building VictorianFurniture2.....");
    }
}
