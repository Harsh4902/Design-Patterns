
public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(1234,"Diesel");
        Car c1 = new Car("Tata","Harier",e1);

        System.out.println(c1);
    }    
}

class Engine{

    int serialNumber;
    String type;

    public Engine(){

    }

    public Engine(int serialNumber,String type){
        this.serialNumber = serialNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.serialNumber+" which is of type "+this.type;
    }
}

class Car{

    String company;
    String model;
    Engine engine;

    public Car(){

    }

    public Car(String company, String model, Engine engine){
        this.company = company;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car " + this.model+"of "+this.company+"has engine "+this.engine.toString();
    }

}
