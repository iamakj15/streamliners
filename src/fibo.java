import java.util.Scanner;

public class fibo {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter a number");
        int a = s1.nextInt();
        int y = 0;int z = 1;int u;

            for (int i = 0; i <a;i++ ) {
                u = y + z;
                y = z;
                z = u;

                System.out.println(y);
            }
        }
    }