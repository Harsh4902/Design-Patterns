//Example for static method

public class Main {
    
    public static void main(String[] args) {
        MathOperation.findSqareRoot(100);
    }

}

class MathOperation{

    public static void findSqareRoot(int a){

        System.out.println("Square root of "+ a + " is " + Math.sqrt(a));

    }

}