package lab1;

public class Lab1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum=0;
        for (int i =0; i<arr.length; i++) {
            sum+=arr[i];
        }
        System.out.print(sum + " " + sum/arr.length);
    }
}
