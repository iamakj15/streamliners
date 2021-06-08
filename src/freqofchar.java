import java.util.Scanner;

public class freqofchar {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter a string");
        String s = s1.next();
        System.out.println("enter the char");
        char ch = s1.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                count++;

            }
        }System.out.println("freq " + count);
    }
}