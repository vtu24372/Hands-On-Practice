import java.util.Scanner;

class Employee{
    String name;
    int id;
}

class Manager extends Employee{
    double salary;
}

class AnnualSalaryCalculation{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Manager m = new Manager();

        m.name = s.nextLine();
        m.id = s.nextInt();
        m.salary = s.nextDouble();

        System.out.println("Name : "+ m.name);
        System.out.printf("Annaual Salary : Rs. %.2f",m.salary*12);
    }
}