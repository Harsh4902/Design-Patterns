//Example for Proxy pattern 2

public class Main {
    
    public static void main(String[] args) {
        Memory memory = new RealMemory();

        memory.allocat();
        memory.allocat();
    }

}


interface Memory{

    void allocat();

}

class RealMemory implements Memory{

    private boolean isAllocated;

    public RealMemory(){
        isAllocated = true;
        provideMemory();
    }

    @Override
    public void allocat() {
        System.out.println("Memory is allocated");
    }

    public void provideMemory(){
        System.out.println("Providing memory from the RAM");
    }

}

class ProxyMemory implements Memory{

    private RealMemory memory;

    @Override
    public void allocat() {
        if(memory == null){
            memory = new RealMemory();
        }
        memory.allocat();
    }

}