import java.util.Locale;

public class capitalfirstletter {
    public static void main(String[] args) {
        String h = "abghi";
        String j = h.substring(0,1);
        String k = h.substring(1,h.length());
        j = j.toUpperCase(Locale.ROOT);
        System.out.println(j + k);
}}
