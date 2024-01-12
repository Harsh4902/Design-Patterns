//Example for adapter pattern

import java.lang.annotation.Target;

public class Main {
    
    public static void main(String[] args) {
        
    }

}

interface Traget{

    void request();

}

class Adaptee{

    public void specificRequest(){
        System.out.println("Specific request for adaptee");
    }
}

class Adapter extends Adaptee implements Traget{

    @Override
    public void request() {
        specificRequest();
    }

}