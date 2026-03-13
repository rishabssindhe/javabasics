package day8;

public class CharFreq {
    public static void main(String[] args) {
        System.out.println((char)('a'-32));//It compares ascii value
        String str="sapthagiri";
        int[] freq=new int[26];
        //Pangram : A quick brown fox jumps over the lazy dog
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0) {
                System.out.println((char) (i+ 'a') + " -> " + freq[i]);
            }
        }
    }
}
