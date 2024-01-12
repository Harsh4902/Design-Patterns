
public class Main{

    public static void main(String [] arg){

        BankAccount account = new BankAccount();
        account.setAccountNumber(12345);
        account.setBalance(12000);

        account.diposite(5000);
        account.withdraw(1200);
    }

}

class BankAccount{

    private long accountNumber;
    private long balance;

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public long getBalance(){
        return this.balance;
    }

    public void diposite(long ammount){

        this.balance += ammount;

        System.out.println("Your account is credited with "+ ammount + "Your current balance is " + this.balance);

    }

    public void withdraw(long ammount){
        this.balance -= ammount;

        System.out.println("Your account is debited with "+ ammount + "Your current balance is " + this.balance);

    }

}