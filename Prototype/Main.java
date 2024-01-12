//Example for Prototype pattern

import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) throws CloneNotSupportedException{
        VehicalRegistry vehicalRegistry = new VehicalRegistry();
        Vehical discover = vehicalRegistry.getVehical("TWO");
    }

}

abstract class Vehical implements Cloneable{

    private String engine;
    
    private String model;

    private long price;

    public Vehical(String engine, String model, long price){
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }
    public String getModel() {
        return model;
    }
    public long getPrice() {
        return price;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    protected Vehical clone() throws CloneNotSupportedException {
        return (Vehical)super.clone();
    }
}

class TwoWheelerVehical extends Vehical{

    private boolean isElectric;

    public TwoWheelerVehical(String engine,String model,long price, boolean isElectric){
        super(engine, model, price);
        this.isElectric = isElectric;
    }

    @Override
    protected TwoWheelerVehical clone() throws CloneNotSupportedException {
        return (TwoWheelerVehical)super.clone();
    }

}

class FourWheelerVehical extends Vehical{

    boolean isAutomatic;
    boolean hasSunroof;

    public FourWheelerVehical(String engine, String model, long price, boolean isAutomatic, boolean hasSunroof){
        super(engine, model, price);
        this.isAutomatic = isAutomatic;
        this.hasSunroof = hasSunroof;
    }

    @Override
    protected FourWheelerVehical clone() throws CloneNotSupportedException {
        return (FourWheelerVehical)super.clone();
    }

}

class VehicalRegistry{

    private static HashMap<String,Vehical> vehicalMap = new HashMap<>();
    static{
        vehicalMap.put("TWO", new TwoWheelerVehical("120", "Royal Enfield", 100000, false));
        vehicalMap.put("FOUR", new FourWheelerVehical("125", "Harrier", 2500000, false, true));
    }

    public Vehical getVehical(String vehical) throws CloneNotSupportedException{
        return vehicalMap.get(vehical).clone();
    }
}