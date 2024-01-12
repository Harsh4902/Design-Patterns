//Operator Overloading

public class Question1 {
    
    public static void main(String[] args) {
        
        /*
        - Basically in java there is no support for operator overloading.
        - There is only way in java java to show the operator overloading. We can demonstrat it with using '+' for a String & Integer.
        - As we know when we add two Integers using '+' we get the addition of both the numbers.But when we use '+' it will concat the number with string.
        - Hence it' only way to show operator overloading.
        */

        int a = 10;
        int b = 34;
        String s = "Hello ";

        System.out.println(a+b);// adding two numbers
        System.out.println(s+a);// concating a integer with string
    }

}
