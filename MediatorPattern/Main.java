//Example for Mediator design pattern

public class Main {
    
    public static void main(String[] args) {
        Colleague c1 = new Colleague("Harshvardhan");
        Colleague c2 = new Colleague("Tushar");

        c1.sendMessage("Hey Tushar!!");
        c2.sendMessage("Hello Harshvardhan !");
    }

}

class Mediator{

    public static void showMessage(Colleague colleague, String message){
        System.out.println("["+colleague.getName()+"] : " + message);
    }

}

class Colleague{

    private String name;

    public Colleague(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message){
        Mediator.showMessage(this, message);
    }

}
