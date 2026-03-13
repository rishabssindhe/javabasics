package day8;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a="silent";
        String b="listen";
        char[] ac=a.toCharArray();
        char[] bc=b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        if(Arrays.equals(ac,bc)){
            System.out.println("Anagrams");
        }
        else System.out.println("Not Anagrams");
    }
}
