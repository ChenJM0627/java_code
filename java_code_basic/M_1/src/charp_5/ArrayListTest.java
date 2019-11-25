package charp_5;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee01> staff = new ArrayList<>();


        staff.add(new Employee01("carl",75000,1987,12,15));
        staff.add(new Employee01("Harry",5000,1989,10,1));
        staff.add(new Employee01("Tony",4000,1990,3,15));

        for(Employee01 e:staff) {
            e.raiseSalary(5);
            System.out.println("name = "+e.getName()+"  salary = "+e.getSalary());
        }

    }
}
