package charp_5;

import java.time.LocalDate;
import java.util.Objects;

public class Employee01 {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee01(String name,double salary,int year,int month,int day){
        this.name = name;
        this.salary = salary;
        hireday = LocalDate.of(year,month,day);

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireday(){
        return hireday;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent;
        salary += raise;
    }

    public boolean equals(Object otherObject){
        if(this == otherObject)
            return true;

        if(otherObject == null)
            return false;

        if(getClass() != otherObject.getClass())
            return false;

        Employee01 other = (Employee01) otherObject;

        return Objects.equals(name,other.name) && salary == other.salary && Objects.equals(hireday,other.hireday);
    }

}
