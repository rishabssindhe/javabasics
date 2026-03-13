package day8;

public class StringReverse {
    public static void main(String[] args) {
        String hi="Rishab";
        String rev="";
        for(int i=hi.length()-1;i>=0;i--){
            rev=rev+hi.charAt(i);
        }
        System.out.println(rev);
    }
}
