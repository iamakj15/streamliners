package task1;

import java.util.*;
public class totwght {
    public static int toUpper(int asciiValue) {
        if (asciiValue > 96 && asciiValue < 123) {
            return asciiValue-32;
        }
        return asciiValue;
    }
    public static int totalWeight(String s, int[] wghts) {
        int weight = 0;

        for (int i = 0; i < s.length(); i++) {
            weight = weight + wghts[toUpper(s.charAt(i))-65];
        }

        return weight;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("String to find weight: ");
        String str = s1.nextLine();

        System.out.print("Weights from A to E: ");
        int[] wghts = new int[5];
        for (int i = 0; i < wghts.length; i++) {
            wghts[i] = s1.nextInt();
        }

        System.out.println("The weight is " + totalWeight(str, wghts));
    }
}
