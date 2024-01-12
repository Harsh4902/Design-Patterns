//Example for State pattern

public class Main {
    
    public static void main(String[] args) {
        
        Context context = new Context();

        StateA stateA = new StateA();
        stateA.doAction(context);
        System.out.println(context.getState());

        StateB stateB = new StateB();
        stateB.doAction(context);
        System.out.println(context.getState());

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

class StateA implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("I am in State A");
        context.setState(this);
        
    }

    @Override
    public String toString() {
        return "State A";
    }
}

class StateB implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("I am in State B");
        context.setState(this);        
    }

    @Override
    public String toString() {
        return "State B";
    }
}