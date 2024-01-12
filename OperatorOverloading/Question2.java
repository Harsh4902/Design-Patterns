

public class Question2 {
    
    public static void main(String[] args) {
        
        ComplexNumber c1 = new ComplexNumber(3, 6);
        ComplexNumber c2 = new ComplexNumber(1, -4);

        c1.print();
        c2.print();

        addTwoNumber(c1, c2).print();

    }

    public static ComplexNumber addTwoNumber(ComplexNumber c1, ComplexNumber c2){

        ComplexNumber result = new ComplexNumber(c1.getReal() + c2.getReal(), c1.getImaginary() + c2.getImaginary());

        return result;

    }

}

class ComplexNumber{

    private int real;
    private int imaginary;

    public ComplexNumber(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print(){
        if(this.imaginary < 0 ){
            System.out.println(this.real + " - i" + this.imaginary*(-1));
        }
        else{
            System.out.println(this.real + " + i" + this.imaginary);
        }
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

}
