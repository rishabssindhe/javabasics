package day5.nestedclass;

public class University {
    static class Admission{
        static boolean isEligible(int marks){
            return marks>=60;
        }
    }

    public static void main(String[] args) {
        boolean result=University.Admission.isEligible(78);
        System.out.println(result);
        boolean result2=University.Admission.isEligible(44);
        System.out.println(result2);
    }
}
/*
Points to remember
No university object needed
Logical grouping of data - improves readability
Similar to create utility helper classes
 */