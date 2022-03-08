package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
        

        Professor professor1 = new Professor();
        professor1.name="Ensar Gül";

        Professor professor2 = new Professor();
        professor2.name="Raif Oruç";

        Student student1 = new Student();
        student1.name="mehmet";
        student1.age=22;
        student1.department="computer";

        Student student2 = new Student();
        student2.name="tunahan";
        student2.age=21;
        student2.department="software";

        Student student3 = new Student();
        student3.name="değirmenci";
        student3.age=20;
        student3.department="civil";

        System.out.println("Prof. "+professor1.name);
        System.out.println("Prof. "+professor2.name);
        System.out.println("stu. "+student1.name+" "+student1.age+" "+student1.department);
        System.out.println("stu. "+student2.name+" "+student2.age+" "+student2.department);
        System.out.println("stu. "+student3.name+" "+student3.age+" "+student3.department);
    }

}

