package lab3.Task4;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Conv {
    public static void main(String[] args) {
        System.out.println("Введите число в долларах: ");
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.JAPAN);
        double n=num*149.54;
        System.out.println("Число в долларах: "+nf1.format(num));
        System.out.println("Число в йенах: "+nf2.format(n));

    }
}
