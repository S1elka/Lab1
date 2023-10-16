package lab3.Task3;
public class Shell {
    public static void main(String[] args) {
        Double num = Double.valueOf("15");
        System.out.println(num);
        String s="20";
        double ans=Double.parseDouble(s);
        System.out.println(ans);
        double d=12.345;
        Double tes=Double.valueOf(d);
        int i=(int) d;
        byte b=(byte) d;
        short sh=(short) d;
        long l=(long) d;
        float f=(float) d;
        char c=(char) d;
        System.out.println(i+" "+b+" "+sh+" "+l+" "+f+" "+c);
        System.out.println(tes);
        String str=Double.toString(tes);
        System.out.println(str);
    }
}
