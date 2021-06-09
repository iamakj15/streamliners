import java.util.Scanner;

public class leapyr {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enteer a yr");
        int h = s1.nextInt();
        if(h%4==0)
            System.out.println("leap yr");
        else
            System.out.println("not leap yr");
    }
}
