import java.util.Arrays;

public class concat {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr2[] = {4,5,6};
        int y[] = new int[arr.length+arr2.length];
        System.arraycopy(arr, 0,y,0, arr.length);
        System.arraycopy(arr2,0,y,arr.length,arr2.length);
        System.out.println(Arrays.toString(y));
    }
}
