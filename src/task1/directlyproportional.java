package task1;

import java.util.*;

public class directlyproportional {
    public static boolean isDirectlyProportional(int[] x, int[] y) {
        double ratio = (double) x[0] / y[0];

        for (int i = 1; i < x.length; i++) {
            if ((double) x[i]/y[i] != ratio) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = s1.nextInt();

        System.out.print("Elements of x: ");
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = s1.nextInt();
        }

        System.out.print("Elements of y: ");
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = s1.nextInt();
        }

        System.out.println("Proportionality is " + isDirectlyProportional(x, y));
    }
}