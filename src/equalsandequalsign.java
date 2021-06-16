public class equalsandequalsign {
    public static void main(String[] args) {
        String h = new String("abhi");
        String j = new String("abhi");
        boolean y = h==j;
        boolean o = h.equals(j);
        System.out.println("using == "+ y);
        System.out.println("using .equals "+o);

    }
}
