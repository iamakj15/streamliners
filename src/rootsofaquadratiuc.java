import java.util.Scanner;

public class rootsofaquadratiuc {
    public static void main(String[] args) {
        Scanner s1  = new Scanner (System.in);
        System.out.println("enter a");
        int a = s1.nextInt();
        System.out.println("enter b");
        int b = s1.nextInt();
        System.out.println("enter c");
        int c = s1.nextInt();
        double y = b*b - 4*a*c;
        double u = Math.sqrt(y);
        double root1 = ((-b + u)/2*a);
        double root2 = ((-b-u)/2*a);
        System.out.println("root 1 "+ root1);
        System.out.println("root 2 " + root2);
    }
}
