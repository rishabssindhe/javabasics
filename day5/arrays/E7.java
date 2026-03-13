package day5.arrays;

import java.util.Arrays;

class Student {
    String name;
}
class Intern{
    String name;
    int id;
    Intern(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class E7 {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student();
        s[0].name = "KL Rahul";

        System.out.println(s[0].name);
        Intern[] i = new Intern[]{
                new Intern("Rishab", 10),
                new Intern("MZEEEEE", 20)
        };
        for (Intern j : i) {
            System.out.println("name "+j.name + "\n ID " + j.id);
        }
    }
}
