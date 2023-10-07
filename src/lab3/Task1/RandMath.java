package lab3.Task1;
import java.util.Arrays;
public class RandMath {
    public static void main(String[] args) {
        double[] arr = new double[10];
        System.out.println("Random numbers: ");
        for(int i=0; i<10; i++){
            arr[i]=Math.random();
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Sorted numbers: ");
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }


    }
}
