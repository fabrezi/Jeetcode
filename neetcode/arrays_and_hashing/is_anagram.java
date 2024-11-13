package arrays_and_hashing;

import java.util.Arrays;

public class is_anagram {

    public static boolean finder(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        char[] chars = s.toCharArray();
        char[] star = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(star);

        if(Arrays.equals(chars, star)){
            return true;
        } else{
            return false;
        }





    }

    public static void main(String[] args){
        String s = "jar";
        String t = "raj";
        System.out.println(finder(s,t));

    }
}
