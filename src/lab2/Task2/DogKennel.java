package lab2.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DogKennel {
    public static Dog[] addDogs(Dog[] arr, String name, int age){
        List<Dog> doggies = new ArrayList<>(Arrays.asList(arr));
        doggies.add(new Dog(name, age));
        return doggies.toArray(new Dog[0]);
    }
    public static void main(String[] args) {
        Dog pet = new Dog("Bobik", 5);
        Dog[] dogs = new Dog[1];
        dogs[0]=pet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько собак вы хотите добавить?\n");
        int i= sc.nextInt();
        for(int j=0; j<i; j++){
            System.out.println("Введите сначала кличку собаки, потом возраст\n");
            String nam = sc.next();
            int ag = sc.nextInt();
            dogs = addDogs(dogs, nam, ag);
        }
        for(int k=0; k<dogs.length; k++){
            System.out.println(dogs[k].getName());
            System.out.println(dogs[k].getAge());
            System.out.println(dogs[k].humanAge());
        }
        dogs[2].setName("Kevin");
        dogs[1].setAge(8);
        for (int l=0; l<dogs.length; l++){
            System.out.println(dogs[l].toString());
        }



    }
}
