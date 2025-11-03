package week3;

public class HighSchoolStudent extends Student{
    String fatherName;

    String getFatherName(){
        return fatherName;
    }
    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "id=" + id +
                ", age=" + getAge() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName= " + fatherName +
                '}';
    }
}
