//Example for Strategy pattern 2

public class Main {

    public static void main(String[] args) {
        
        //Performing Payments using different strategy

        Billing normalBilling = new NormalBilling();
        Billing discountBilling = new DiscountBillin();

        System.out.println(normalBilling.makeBill());
        System.out.println(discountBilling.makeBill());

    }

}

interface Billing{
    String makeBill();
}

class NormalBilling implements Billing{
    @Override
    public String makeBill() {
        return "Created normal bill";
    }
}

class DiscountBillin implements Billing{
    @Override
    public String makeBill() {
        return "Created discounted bill.";
    }
}