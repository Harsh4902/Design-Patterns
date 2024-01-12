//Method Overloading Example

public class Main {
    
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println(calculator.add(34, 21));
		System.out.println(calculator.add(12,56,90));
	}

}

class Calculator{

    public int add(int a, int b){
		return a+b;
    }

	public int add(int a, int b, int c){
		return a+b+c;
	}

}
