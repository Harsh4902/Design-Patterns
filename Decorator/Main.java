//Decorator pattern example

public class Main {
    public static void main(String[] args) {

        //Normal coffeer
        Coffee coffee = new CoffeeDecorator(new CoffeeImpl());
        System.out.println(coffee.decorate());// >>> Coffee

        //Decorating coffee with milk
        Coffee coffee1 = new MilkDecorator(new CoffeeImpl());
        System.out.println(coffee1.decorate());// >>> Coffee with Milk

        //Decorating coffee with milk & Sugar
        Coffee coffee2 = new SugarDecorator(new MilkDecorator(new CoffeeImpl()));
        System.out.println(coffee2.decorate());// >>> Coffee with Milk with Sugar
    }
}

interface Coffee{
    String decorate();
}

class CoffeeImpl implements Coffee{
    @Override
    public String decorate() {
        return "Coffee";
    }
}

class CoffeeDecorator implements Coffee{

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String decorate() {
        return coffee.decorate();
    }
}

class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    public String decorate(){
        return super.decorate() + decorateWithMilk();
    }

    public String decorateWithMilk(){
        return " with Milk";
    }

}

class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    public String decorate(){
        return super.decorate() + decorateWithSugar();
    }

    public String decorateWithSugar(){
        return " with Sugar";
    }

}
