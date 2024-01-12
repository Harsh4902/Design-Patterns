import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        
        List<Element> elements = new ArrayList<>();
        elements.add(new Image("resume.jpeg", 3.7f));
        elements.add(new Paragragh(45, 5, 50));
        elements.add(new Paragragh(18, 3, 21));
        elements.add(new Image("photo.jpeg", 1.0f));
        elements.add(new Image("32400000324.jpeg", 15.7f));
        elements.add(new Paragragh(67, 8, 75));
        elements.add(new Image("signature.jpeg", 1.4f));
        elements.add(new Paragragh(7, 1, 7));
        elements.add(new Image("324243234200.jpeg", 10.7f));
        elements.add(new Paragragh(26, 5, 31));
        elements.add(new Paragragh(45, 5, 50));

        Visitor elmenVisitor = new ElementVisitor();

        for (Element element : elements) {
            element.accept(elmenVisitor);
        }
    }

}

interface Visitor{
    void visit(Paragragh element);
    void visit(Image element);
}

class ElementVisitor implements Visitor{

    @Override
    public void visit(Image element) {
        System.out.println("Visiting image " + element.fileName + " has size " + element.size);
    }

    @Override
    public void visit(Paragragh element) {
        System.out.println("Visiting pragraph is starting form line no. " + element.startLineNo +  " and ending at line no. " + element.endlineNo + ". It has total " + element.noOfLines + " lines.");
    }
}

interface Element{
    void accept(Visitor visitor);
}

class Paragragh implements Element{

    int noOfLines;
    int startLineNo;
    int endlineNo;

    public Paragragh(int noOfLines, int startLineNo, int endlineNo){
        this.noOfLines  = noOfLines;
        this.endlineNo = endlineNo;
        this.startLineNo = startLineNo;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

class Image implements Element{

    String fileName;
    float size;

    public Image(String fileName, float size){
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
