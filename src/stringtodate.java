import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class stringtodate {
    public static void main(String args[]){


    String a = "2021-06-16";
    LocalDate date = LocalDate.parse(a, DateTimeFormatter.ISO_DATE);
        System.out.println(date);

}}
