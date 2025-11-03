package week3;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.id = 1;
        student.setAge(15);
        student.name = "Ahmet";
        student.surname = "Kara";



        System.out.println(student.toString());

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Ayşe";
        student2.surname = "Yalcın";
        student2.setAge(18);

        Student student3 = new Student(3, 20, "Mehmet", "Demir");


        System.out.println(student2.toString());

    }
}
