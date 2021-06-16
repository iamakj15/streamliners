import java.util.Locale;
import java.util.Random;
public class randomstring {
    public static void main(String[] args) {
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder s1 = new StringBuilder();
        Random random = new Random();
        int l =7;
        for (int i=0;i<l;i++){
            int h = random.nextInt(a.length());
            char randomchar = a.charAt(h);
            s1.append(randomchar);
    }
        String hj = s1.toString();
        hj = hj.toLowerCase(Locale.ROOT);
        System.out.println(hj);
}}
