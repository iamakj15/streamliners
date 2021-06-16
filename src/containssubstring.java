public class containssubstring {
    public static void main(String[] args) {
        String txt = "abhishek kumar jha";
        String str1 = "abhishek";
        String str2 = "jha";

        boolean result = txt.contains(str1);
        if(result) {
            System.out.println(str1 + " is present in the string.");
        }
        else {
            System.out.println(str1 + " is not present in the string.");
        }

        result = txt.contains(str2);
        if(result) {
            System.out.println(str2 + " is present in the string.");
        }
        else {
            System.out.println(str2 + " is not present in the string.");
        }
    }
}

