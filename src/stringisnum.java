public class stringisnum {
    public static void main(String[] args) {
        String h = "564";
        boolean y = true;
        try {
            int j = Integer.parseInt(h);
        }catch(NumberFormatException e){
            y = false;
            }

        if (y)
            System.out.println("string is integer");
        else
            System.out.println("string is not int");
    }
}
