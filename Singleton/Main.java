//Example for signgleton class

public class Main {
    public static void main(String[] args) {
        Logger s1 = Logger.getInstace();
        Logger s2 = Logger.getInstace();


        //As it follows singleton pattern both the instace s1 and s2 are same thus we will see 'true' as output
        System.out.println(s1==s2);
    }    
}

class Logger{

    private static Logger instance = null;

    public String s;

    private Logger(){
        s = "Logging from the singleton class";
    }

    public static Logger getInstace(){

        if(instance == null)
            instance = new Logger();

        return instance;
    }

}