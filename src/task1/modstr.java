package task1;

import java.util.*;
public class modstr {
    public static String modify(String s, String rep) {
        char[] arr = new char[10];

        for (int i = 0; i < rep.length(); i += 2) {
            arr[rep.charAt(i)-48] = rep.charAt(i+1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = arr[s.charAt(i)-48];
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Numeric string");
        String str = s1.nextLine();

        System.out.print("Replacement string: ");
        String rep2 = s1.nextLine();

        System.out.println("New string is " + modify(str, rep2));
    }
}
