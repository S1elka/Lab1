package lab3.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Tester {
    public static int getMax(Circle[] arr){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].getRad()>max){
                max=arr[i].getRad();
            }
        }
        return max;
    }
    public static int getMin(Circle[] arr){
        int min=2146483647;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i].getRad()){
                min=arr[i].getRad();
            }
        }
        return min;
    }
    public static void Sorting(Circle[] arr){
        Point ob=new Point(1, 1);
        Circle buff=new Circle(ob, 1);
        for(int i=1; i<arr.length; i++){
            if(arr[i-1].getRad()>arr[i].getRad()){
                buff=arr[i];
                arr[i]=arr[i-1];
                arr[i]=buff;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand= new Random();
        System.out.println("Введите размер массива: ");
        int cnt=sc.nextInt();
        Circle[] arr= new Circle [cnt];
        for(int i=0; i<cnt; i++){
            double x=Math.random();
            double y=Math.random();
            Point poi=new Point(x, y);
            int rd=Math.abs(rand.nextInt());
            arr[i]=new Circle(poi, rd);
        }
        Sorting(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
        System.out.println("Минимальная окружность с радиусом: "+getMin(arr)+"\nМаксимальная окружность с радиусом: "+getMax(arr));
    }
}
