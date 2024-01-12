public class Main {
    public static void main(String[] args) {
        
        Circle c1 = new Circle(10);
        c1.area();
        c1.perimeter();

        Triangle t1 = new Triangle(3, 5, 4);
        t1.area();
        t1.perimeter();

    }
}

interface Shape{

    public void area();

    public void perimeter();

}

class Circle implements Shape{


    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void area() {
    
        double area = 3.14 * this.radius * this.radius;

        System.out.println("Area of given circle is "+ area);
    
    }

    @Override
    public void perimeter() {
        double pariemeter = 2 * 3.14 * this.radius;

        System.out.println("Perimeter of given circle is "+ pariemeter);
    }
}

class Triangle implements Shape{

    int a;
    int b;
    int c;

    public Triangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void area() {
        
        double s = this.a+this.b+this.c/2;

        double area = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));

        System.out.println("Area of given triangle is "+ area);
        
    }

    @Override
    public void perimeter() {
        
        int pariemeter = this.a+this.b+this.c;

        System.out.println("Perimeter of given triangle is "+ pariemeter);
        
    }

}
