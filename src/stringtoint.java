import java.util.Scanner;

public class stringtoint {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter a string");
        String h = s1.next();
        int i = Integer.parseInt(h);
        System.out.println(i);
    }
}
