package lab2.Task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author hum = new Author("Mike", "Priem@mirea.ru", 'm');
        System.out.println("Имя: " + hum.getName());
        System.out.println("Почта: " + hum.getEmail());
        Scanner sc = new Scanner(System.in);
        String mail = sc.next();
        hum.setEmail(mail);
        System.out.println("Новый email: " + hum.getEmail());
        System.out.println("Пол: " + hum.getGender());
        System.out.println(hum.toString());
    }
}
