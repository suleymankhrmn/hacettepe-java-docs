package week3;

public class Student {
    public static final int MAX_AGE = 25;

    int id;
    private int age;
    String name;
    String surname;
    public static int count;
    String department;


    public Student(int id, int age, String name, String surname) {
        this.id = id;
        setAge(age);
        this.name = name;
        this.surname = surname;
        increaseCount();
    }

    public Student() {
        increaseCount();
    }

    public void setAge(int value){
        final int MIN_AGE = 13;
        if(value < MIN_AGE){
            System.out.println("cannot set under 13");
            //System.exit(1);
        }
        if(value < MAX_AGE){
            this.age = value;
        }else {
            System.out.println("cannot set over 25");
            System.exit(1);
        }
    }

    public int getAge(){
        return age;
    }

    private void increaseCount(){
        count++;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
