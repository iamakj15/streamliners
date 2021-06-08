import java.util.Scanner;

public class removewhitespaces {
    public static void main(String[] args) {
        Scanner s1 = new Scanner (System.in);
        System.out.println("enter a string");
        String h = s1.nextLine();
             String j = h.replaceAll("\\s", "");
             System.out.println(j);
    }
}
