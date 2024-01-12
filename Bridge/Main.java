//Example for bridge pattern

public class Main {
    public static void main(String[] args) {
        
        Color red = new Red();
        Color blue = new Blue();

        Shape square = new Square(red);
        System.out.println(square.draw());

        square = new Square(blue);
        System.out.println(square.draw());
    }
}

interface Color{
    String fill();
}

class Red implements Color{
    @Override
    public String fill() {
        return "Color is Red.";
    }
}

class Blue implements Color{
    @Override
    public String fill() {
        return "Color is Blue.";
    }
}

abstract class Shape{
    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract String draw();
}

class Square extends Shape{

    public Square(Color color){
        super(color);
    }

    @Override
    public String draw() {
        return "Square is drawn. " + color.fill();
    }
}
