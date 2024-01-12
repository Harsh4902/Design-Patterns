import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        
        List<Element> elements = new ArrayList<>();
        elements.add(new ElementA(10, "ParleG"));
        elements.add(new ElementB(100, "Facewash",10021));
        elements.add(new ElementA(45, "Salt"));
        elements.add(new ElementA(20, "Balaji wafer"));
        elements.add(new ElementB(600, "Almonds",400002));                

        Visitor elmenVisitor = new ElementVisitor();

        for (Element element : elements) {
            element.accept(elmenVisitor);
        }
    }

}

interface Visitor{
    void visit(ElementA element);
    void visit(ElementB element);
}

class ElementVisitor implements Visitor{

    @Override
    public void visit(ElementB element) {
        System.out.println("Visiting element has valeues: " + element.id + " " + element.name + " " + element.price);
    }

    @Override
    public void visit(ElementA element) {
        System.out.println("Visiting element has valeues: "+ element.name + " " + element.price);
    }
}

interface Element{
    void accept(Visitor visitor);
}

class ElementA implements Element{

    int price;
    String name;

    public ElementA(int price,String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

class ElementB implements Element{

    int price;
    String name;
    long id;

    public ElementB(int price,String name,long id){
        this.price = price;
        this.name = name;
        this.id = id;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}