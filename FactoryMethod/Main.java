//Example for factory method pattern
public class Main {

    public static void main(String[] args) {
        
        //Creating PDF Document using PDFDocument Factory
        DocumentFactory pdfDocumentFactory = new PDFDocumentFactory();
        Document document = pdfDocumentFactory.CreatDocument();
        document.print();

        //Creating Word Document using WordDocument factory
        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        document = wordDocumentFactory.CreatDocument();
        document.print();

    }

}

interface Document{
    void print();
}

class PDFDocument implements Document{

    @Override
    public void print() {
        System.out.println("Printing PDF document......");
    }

}

class WordDocument implements Document{

    @Override
    public void print() {
        System.out.println("Printing Word Document......");
    }

}

abstract class DocumentFactory{

    public Document print(){
        Document document = CreatDocument();
        return document;
    }

    abstract Document CreatDocument();

}

class PDFDocumentFactory extends DocumentFactory{
    @Override
    Document CreatDocument() {
        return new PDFDocument();
    }
}

class WordDocumentFactory extends DocumentFactory{
    @Override
    Document CreatDocument() {
        return new WordDocument();
    }
}