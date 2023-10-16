package lab3.Task5;

public class Employee {
    private String fullname;
    private double salary;
    public Employee(String fullname, double salary){
        this.fullname=fullname;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

}
