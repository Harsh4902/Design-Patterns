//Example for Interface

public class Main {
    public static void main(String[] args) {
        Drawable c1 = new Circle();
        Drawable r1 = new Ractangle();

        c1.draw();
        r1.draw();
    }    
}

interface Drawable{

    public void draw();

}

class Circle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }
}

class Ractangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Draw a Triangle");
    }
}