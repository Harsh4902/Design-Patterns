//Example for template method pattern

public class Main {
    
    public static void main(String[] args) {
        Game game = new Football();
        game.play();

        game = new Basketball();
        game.play();
    }

}

abstract class Game{

    abstract void initialize();
    abstract void startPlay();
    abstract void stopPlay();

    public final void play(){
        initialize();
        startPlay();
        stopPlay();
    }

}

class Football extends Game{

    @Override
    void initialize() {

        System.out.println("Football game is intialize.......");
        
    }

    @Override
    void startPlay() {
        System.out.println("Football game is Started.........");
    }

    @Override
    void stopPlay() {
        System.out.println("Football game is Finished........");
    }

}

class Basketball extends Game{

    @Override
    void initialize() {

        System.out.println("Basketball game is intialize.......");
        
    }

    @Override
    void startPlay() {
        System.out.println("Basketball game is Started.........");
    }

    @Override
    void stopPlay() {
        System.out.println("Basketball game is Finished........");
    }

}

