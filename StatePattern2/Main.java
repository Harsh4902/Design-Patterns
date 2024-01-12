//Example for State pattern

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Context context = new Context();
        State noCoin = new NoCoinState();
        State hasCoin = new HasCoinState();
        while(true){
            System.out.println("Enter 1 to add coin : ");
            int input = Integer.parseInt(sc.next());

            if(input == 1){
                hasCoin.doAction(context);
                System.out.println("Current State: "+context.getState());
            }
            else{
                noCoin.doAction(context);
                System.out.println("Current State: "+context.getState());
            }
            
        }
    }

}


interface State{
    void doAction(Context context);
}

class Context{

    private State state;

    public Context(){
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}


class NoCoinState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Moving vending machine into NO COIN STATE");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "NO COIN STATE";
    }
}

class HasCoinState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Moving vending machine into HAS COIN STATE");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "HAS COIN STATE";
    }
}
