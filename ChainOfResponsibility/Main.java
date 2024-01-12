//Example for chain of Responsibility pattern

public class Main {
    
    public static void main(String[] args) {
        
        RequestHandler requestHandlerChain = getChainOfHandlers();

        requestHandlerChain.handleRequest(3, "Create desing for Hospital management system.");
        requestHandlerChain.handleRequest(1,"Write code for the Hospital management system.");
        requestHandlerChain.handleRequest(2, "Hospital manangement system's code is ready. Deploy it.");

    }

    private static RequestHandler getChainOfHandlers(){
        RequestHandler projectManager = new ProjectManger(3);
        RequestHandler developers = new Developer(1);
        RequestHandler operations = new Operation(2);

        projectManager.setNextHandler(operations);
        operations.setNextHandler(developers);

        return projectManager;
    }

}

abstract class RequestHandler{

    public static final int DESIGN_PROJECT = 3;
    public static final int WRITE_CODE = 1;
    public static final int DEPLOY_CODE = 2;

    int level;

    RequestHandler nextRequestHandler;

    public void setNextHandler(RequestHandler nextRequestHandler){
        this.nextRequestHandler = nextRequestHandler;
    }

    public void handleRequest(int level, String message){
        if(this.level == level){

            System.out.println("Recived request: " + message);
            handle();
        }
        if (nextRequestHandler != null) {
            nextRequestHandler.handleRequest(level, message);
        }
    }

    abstract void handle();

}

class ProjectManger extends RequestHandler{

    public ProjectManger(int level){
        this.level = level;
    }

    @Override
    void handle() {
        System.out.println("Project Menager is handling this request........");
    }
}

class Developer extends RequestHandler{

    public Developer(int level){
        this.level = level;
    }

    @Override
    void handle() {
        System.out.println("Developers are handling this request........");
    }

}

class Operation extends RequestHandler{

    public Operation(int level){
        this.level = level;
    }

    @Override
    void handle() {
       System.out.println("Operations team is handling this request........"); 
    }

}