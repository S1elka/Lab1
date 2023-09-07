package lab1;

import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Введите элементы массива по одному");
        for (int i =0; i<arr.length; i++) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                arr[i] = num;
            }
        }
        int min = arr[0], count = 0, max = arr[0];
        while (count<arr.length) {
            if (min>arr[count]) {
                min = arr[count];
            }
            if(max<arr[count]) {
                max = arr[count];
            }
            count+=1;
        }
        System.out.println("Максимальное значение: "+max+" Минимальное значение: "+min);
    }
}
