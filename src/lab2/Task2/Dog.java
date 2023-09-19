package lab2.Task2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int humanAge(){
        return this.age*7;
    }
    public String toString(){
        return "Имя собаки: " + this.name + ", Возраст собаки: " + this.age + ", Возраст в переводе на человеческий: " + this.humanAge();
    }
}
