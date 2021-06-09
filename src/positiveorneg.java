import java.util.Scanner;

public class positiveorneg {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter a number");
        double j = s1.nextDouble();
        if(j>0.0)
            System.out.println("positive");
        else if(j<0.0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
}
