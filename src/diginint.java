import java.util.Scanner;

public class diginint {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter a no.");
        int h = s1.nextInt();
       int count=0;
        while(h!=0){
            h = h/10;
            ++count;}
        System.out.println(count);


}}
