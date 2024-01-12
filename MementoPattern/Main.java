//Eample for Memento pattern

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Originator originator = new Originator();
        Caretacker caretacker = new Caretacker();

        originator.setState("State 1");
        originator.setState("State 2");
        caretacker.add(originator.saveStateToMemento());

        originator.setState("State 3");
        caretacker.add(originator.saveStateToMemento());
      
        originator.setState("State 4");
        System.out.println("Current State: " + originator.getState());		
        
        originator.getStateFromMemento(caretacker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(caretacker.get(1));
        System.out.println("Second saved State: " + originator.getState());

    }

}

//Memento class
class Memento{

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}


//Originator class
class Originator {

    private String state;

    public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Memento saveStateToMemento(){
      return new Memento(state);
   }

   public void getStateFromMemento(Memento memento){
      state = memento.getState();
   }
}

//Caretacker class
class Caretacker{
    private List<Memento> mementos = new ArrayList<Memento>();

    public void add(Memento memento){
        mementos.add(memento);
    }

    public Memento get(int index){
        return mementos.get(index);
    }
}
