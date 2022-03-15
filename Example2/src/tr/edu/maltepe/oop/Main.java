package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Professor p1=new Professor();
        p1.setName("ensar gül");

        Student s1=new Student();
        s1.setName("tuna");

        p1.teaches();

        s1.learning();



    }

}

