//Example for Composite pattern

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Component l1 = new Leaf("Leaf #1");
        Component l2 = new Leaf("Leaf #2");

        Composite composite = new Composite("Composite #1");

        composite.addLeaf(l1);
        composite.addLeaf(l2);

        composite.printComponentName();
    }

}

interface Component{
    void printComponentName();
}

class Leaf implements Component{
    String leafName;

    public Leaf(String name){
        this.leafName = name;
    }

    @Override
    public void printComponentName() {
        System.out.println(leafName);
    }
}

class Composite implements Component{

    String compositeName;

    List<Component> leaves;

    public Composite(String compositeName){
        this.compositeName = compositeName;
        this.leaves = new ArrayList<>();
    }

    @Override
    public void printComponentName() {
        leaves.forEach(Component::printComponentName);
    }

    public void addLeaf(Component leaf){
        leaves.add(leaf);
    }

    public void removeLeaf(Component leaf){
        leaves.remove(leaf);
    }

}