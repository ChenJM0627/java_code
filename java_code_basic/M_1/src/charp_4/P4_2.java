package charp_4;

import java.time.LocalDate;

public class P4_2 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("C",75000,1987,12,15);
        staff[1] = new Employee("J",5000,1989,10,1);
        staff[2] = new Employee("M",4000,1990,3,15);

        for(Employee e: staff)
            e.raiseSalary(5);

        for(Employee e : staff)
            System.out.println("name = "+e.getName() + ",salary = "+e.getSalary()+",hireDay = "+e.getHireDay());


    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public  LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }
}
