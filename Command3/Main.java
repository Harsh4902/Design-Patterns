//Example for Command Pattern

public class Main {
    public static void main(String[] args) {

        Light l1 = new Light();
        AC ac = new AC();
        System.out.println("Light is on? : " + l1.getOn());
        System.out.println("AC is on? : " + ac.getOn());

        Remote lightRemote = new LightRemote(l1);
        Remote acRemote = new ACRemote(ac);

        lightRemote.on();
        System.out.println("Light is on? : " + l1.getOn());

        acRemote.off();
        System.out.println("AC is on? : " + ac.getOn());
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

//Implematation for AC
class AC{
    private boolean isOn;
    
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    
    public boolean getOn(){
        return this.isOn;
    }
}

class ACRemote implements Remote{
    
    AC ac;
    
    public ACRemote(AC ac){
        this.ac = ac;
    }
    
    @Override
    public void off() {
        new ACOffCommand(ac).execute();
    }
    
    @Override
    public void on() {
        new ACOnCommand(ac).execute();
    }
    
} 

class ACOnCommand implements Command{
    
    private AC ac;
    
    public ACOnCommand(AC ac){
        this.ac = ac;
    }
    
    @Override
    public void execute() {
        ac.setOn(true);
        
    }
}

class ACOffCommand implements Command{
    
    private AC ac;
    
    public ACOffCommand(AC ac){
        this.ac = ac;
    }
    
    @Override
    public void execute() {
        ac.setOn(false);
        
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
