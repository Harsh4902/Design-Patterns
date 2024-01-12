
public class Main {
    public static void main(String[] args) {
        AbstractFactory f1 = new ConcreteFactory1();
        f1.creatDekstopUI();
        f1.creatMobileUI();

        AbstractFactory f2 = new ConcreteFactory2();
        f2.creatDekstopUI();
        f2.creatMobileUI();
    }
}

abstract class AbstractFactory{

    abstract DekstopUI creatDekstopUI();
    abstract MobileUI creatMobileUI();
}

interface DekstopUI{
    void build();
}
interface MobileUI{
    void build();
}

class ConcreteFactory1 extends AbstractFactory{
    @Override
    DekstopUI creatDekstopUI() {
        return new DekstopUI1();
    }
    @Override
    MobileUI creatMobileUI() {
        return new MobileUI1();
    }
}

class ConcreteFactory2 extends AbstractFactory{
    @Override
    DekstopUI creatDekstopUI() {
        return new DekstopUI2();
    }
    @Override
    MobileUI creatMobileUI() {
        return new MobileUI2();
    }
}

class DekstopUI1 implements DekstopUI{

    public DekstopUI1(){
        build();
    }

    @Override
    public void build() {
        System.out.println("Building DekstopUI1.....");
    }
}

class DekstopUI2 implements DekstopUI{

    public DekstopUI2(){
        build();
    }

    @Override
    public void build() {
        System.out.println("Building DekstopUI2.....");
    }
}

class MobileUI1 implements MobileUI{

    public MobileUI1(){
        build();
    }

    @Override
    public void build() {
        System.out.println("Building MobileUI1.....");
    }
}

class MobileUI2 implements MobileUI{
    
    public MobileUI2(){
        build();
    }
    
    @Override
    public void build() {
        System.out.println("Building MobileUI2.....");
    }
}

