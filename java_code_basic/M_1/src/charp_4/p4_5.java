package charp_4;

import java.time.LocalDate;

public class p4_5 {
    public static void main(String[] args) {


    }

    public class E{
        private String name;
        private double salary;
        private LocalDate hireday;

        public E(String name,double salary,int year,int month,int day){
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



}

