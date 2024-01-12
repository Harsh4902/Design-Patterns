//Example for iterator pattern
import java.util.ArrayList;
import java.util.List;

interface Iterator<T> {
    boolean hasNext();
    T next();
}

public class Main {
    
    public static void main(String[] args) {
        
        StudentList list = new StudentList();

        Iterator<Student> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }


}

class Student{
    String name;
    int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
         return "Name: "+ this.name +" Age: "+this.age;
    }
}

class StudentList{
    private final List<Student> students;

    public StudentList(){
        students = List.of(new Student("Harshvardhan", 21),
                           new Student("Jay", 20),
                           new Student("Vaibhav", 24),
                           new Student("Bhavin", 19),
                           new Student("Tushar", 22),
                           new Student("Smit", 20),
                           new Student("Dikshit", 24),
                           new Student("Harshraj", 23));
    }

    public Iterator<Student> iterator(){
        return new StudentListItemIterator(this);
    }

    public List<Student> getStudents(){
        return new ArrayList<>(students);
    }
}

class StudentListItemIterator implements Iterator{

    private final StudentList studentList;
    private int index;
    public StudentListItemIterator(StudentList studentList){
        this.studentList = studentList;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        if(index+1 >= studentList.getStudents().size() || studentList.getStudents().get(index+1) == null)
            return false;
        return true;
    }
    @Override
    public Object next() {
        index++;
        return studentList.getStudents().get(index);
    }

}
