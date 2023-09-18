package lab1;

public class lab1_5 {
    public static int factor(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factor(5));
    }
}
