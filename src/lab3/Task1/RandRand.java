package lab3.Task1;

import java.util.Arrays;
import java.util.Random;

public class RandRand {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Random rand = new Random();
        System.out.println("Random numbers: ");
        for(int i=0; i<10; i++){
            arr[i]=rand.nextDouble();
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Sorted numbers: ");
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }
    }
}
