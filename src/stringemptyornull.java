import java.util.Scanner;

public class stringemptyornull {
    public static void main(String[] args) {
        String h = "";
        if(h==null)
            System.out.println("null");
        else if (h.isEmpty())
            System.out.println("empty");
        else
            System.out.println("neither null or empty");
    }
}
