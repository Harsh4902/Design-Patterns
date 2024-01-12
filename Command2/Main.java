//Example for Command Pattern

public class Main {
    public static void main(String[] args) {

        Light l1 = new Light();
        TV tv = new TV();
        System.out.println("Light is on? : " + l1.getOn());
        System.out.println("TV is on? : " + tv.getOn());

        Remote lightRemote = new LightRemote(l1);
        Remote tvRemote = new TVRemote(tv);

        lightRemote.on();
        System.out.println("Light is on? : " + l1.getOn());

        lightRemote.off();
        System.out.println("Light is on? : " + l1.getOn());

        tvRemote.on();
        System.out.println("TV is on? : " + tv.getOn());

        tvRemote.off();
        System.out.println("TV is on? : " + tv.getOn());
    }
}

//Interfaces
interface Command{
    void execute();
}

interface Remote{
    void on();
    void off();
}
//

//Implematation for TV
class TV{
    private boolean isOn;
    
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    
    public boolean getOn(){
        return this.isOn;
    }
}

class TVRemote implements Remote{
    
    TV tv;
    
    public TVRemote(TV tv){
        this.tv = tv;
    }
    
    @Override
    public void off() {
        new TVOffCommand(tv).execute();
    }
    
    @Override
    public void on() {
        new TVOnCommand(tv).execute();
    }
    
} 

class TVOnCommand implements Command{
    
    private TV tv;
    
    public TVOnCommand(TV tv){
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.setOn(true);
        
    }
}

class TVOffCommand implements Command{
    
    private TV tv;
    
    public TVOffCommand(TV tv){
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.setOn(false);
        
    }
}
//

//Implementation for light 
class Light{
    private boolean isOn;
    
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    
    public boolean getOn(){
        return this.isOn;
    }
}

class LightRemote implements Remote{
    
    Light light;
    
    public LightRemote(Light light){
        this.light = light;
    }
    
    @Override
    public void off() {
        new LightOffCommand(light).execute();
    }
    
    @Override
    public void on() {
        new LightOnCommand(light).execute();
    }
    
} 

class LightOnCommand implements Command{
    
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.setOn(true);

    }
}

class LightOffCommand implements Command{
    
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.setOn(false);
    }
}
//
