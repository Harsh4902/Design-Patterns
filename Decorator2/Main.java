//Decorator pattern example 2

public class Main {
    public static void main(String[] args) {

        //Normal Textr
        Text Text = new TextDecorator(new TextImpl());
        System.out.println(Text.decorate());// >>> Text

        //Decorating Text with milk
        Text Text1 = new BoldDecorator(new TextImpl());
        System.out.println(Text1.decorate());// >>> Text with Bold

        //Decorating Text with milk & Sugar
        Text Text2 = new ItalicDecorator(new BoldDecorator(new TextImpl()));
        System.out.println(Text2.decorate());// >>> Text with Bold with Italic
    }
}

interface Text{
    String decorate();
}

class TextImpl implements Text{
    @Override
    public String decorate() {
        return "Text";
    }
}

class TextDecorator implements Text{

    private Text Text;

    public TextDecorator(Text Text){
        this.Text = Text;
    }

    @Override
    public String decorate() {
        return Text.decorate();
    }
}

class BoldDecorator extends TextDecorator{

    public BoldDecorator(Text Text){
        super(Text);
    }

    public String decorate(){
        return super.decorate() + decorateWithMilk();
    }

    public String decorateWithMilk(){
        return " with Bold";
    }

}

class ItalicDecorator extends TextDecorator{

    public ItalicDecorator(Text Text){
        super(Text);
    }

    public String decorate(){
        return super.decorate() + decorateWithSugar();
    }

    public String decorateWithSugar(){
        return " with Italic";
    }

}

