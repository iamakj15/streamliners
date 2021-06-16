import javax.swing.*;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String j = "top";
        String h = "pot";
        if(j.length()==h.length())
        {
            char arr[] = j.toCharArray();
            char arr2[] = h.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr2);
            boolean r = Arrays.equals(arr,arr2);
            if(r)
                System.out.println("anagram");
            else
                System.out.println("not anagram");
        }
            else {
            System.out.println("not anagram");
    }}
    }
