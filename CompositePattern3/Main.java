//Example for Directory pattern

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Component l1 = new File("File #1");
        Component l2 = new File("File #2");

        Directory directory = new Directory("Directory #1");

        directory.addFile(l1);
        directory.addFile(l2);

        directory.printComponentName();
    }

}

interface Component{
    void printComponentName();
}

class File implements Component{
    String fileName;

    public File(String name){
        this.fileName = name;
    }

    @Override
    public void printComponentName() {
        System.out.println(fileName);
    }
}

class Directory implements Component{

    String directoryName;

    List<Component> files;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        this.files = new ArrayList<>();
    }

    @Override
    public void printComponentName() {
        files.forEach(Component::printComponentName);
    }

    public void addFile(Component file){
        files.add(file);
    }

    public void removeFile(Component file){
        files.remove(file);
    }

}
