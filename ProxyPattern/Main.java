//Example for Proxy pattern

public class Main {
    
    public static void main(String[] args) {
        Image image = new ProxyImage("Harshvardhan.jpeg");
        
        //First Time it will load image from disk first and then display
        image.display();

        //This time it will not load image from disk. It will directly display the file.
        image.display();
    }

}

interface Image{
    void display();
}

class ProxyImage implements Image{

   private RealImage realImage;
   private String fileName;

   public ProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if(realImage == null){
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }

}

class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying File :" + fileName);    
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading file: " + fileName);
    }

}


