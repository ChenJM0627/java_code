package charp_5;

import java.time.LocalDate;

public class p5_2 {


private String name;
private double salary;
private LocalDate hireday;

public p5_2(String name,double salary,int year,int month,int day){
            this.name = name;
            this.salary = salary;
            this.hireday = LocalDate.of(year,month,day);

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







}
