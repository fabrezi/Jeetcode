import java.util.Arrays;

public class sort {

    public static void main(String[] args) {

        String s = "car";
        String t = "arc";

        char[] chars = s.toCharArray();
        char[] cahrse = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(cahrse);

        if(Arrays.equals(chars, cahrse)){
            System.out.println("there is one");
        }else{
            System.out.println("WORNG");
        }

    }
}
