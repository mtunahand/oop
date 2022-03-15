package tr.edu.maltepe.oop;

public class Student extends Person {


    public Student(String name){
        super(name);
    }


    public void learning(){
        System.out.println("student "+super.getName()+" is learnıng now");

    }
}
