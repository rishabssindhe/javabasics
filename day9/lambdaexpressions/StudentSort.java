package day9.lambdaexpressions;
import java.util.ArrayList;
import java.util.Collections;

class Student{
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101,"Rishab"));
        list.add(new Student(107,"Rishab S"));
        list.add(new Student(102,"Tejas Mg"));
        for(Student s:list){
            System.out.println(s.id+", "+s.name);
        }
        Collections.sort(list,(a,b)->a.id-b.id);
        for(Student s:list){
            System.out.println(s.id+", "+s.name);
        }
    }
}
