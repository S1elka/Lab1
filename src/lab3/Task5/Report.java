package lab3.Task5;

public class Report {
    private Employee emp;
    public static void generateReport(Employee[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println("Сотрудник: "+arr[i].getFullname());
            System.out.printf("Зарплата = %10.2f", arr[i].getSalary());
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Employee[] arr= new Employee[5];
        arr[0]=new Employee("Albus Persival Dumbledore", 2342.238);
        arr[1]=new Employee("Barry Allen", 346.2938);
        arr[2]=new Employee("Pinkie Pie", 456.39457);
        arr[3]=new Employee("Rick Sanchez", 9384.2435);
        arr[4]=new Employee("Morty Smith", 22.23);
        generateReport(arr);
    }
}
