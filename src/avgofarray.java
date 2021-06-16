public class avgofarray {
    public static void main(String args[]){
    double sum = 0; double t = 0;{
        double arr[] = {45, 45.6, 78, 97};
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            t = sum/ arr.length;
        }
        System.out.println(t);
    }
}}
