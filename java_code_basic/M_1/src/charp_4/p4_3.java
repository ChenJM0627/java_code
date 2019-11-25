package charp_4;

public class p4_3 {
    public static void main(String[] args) {
        Employee1[] staff1 = new Employee1[3];

        staff1[0] = new Employee1("C",75000);
        staff1[1] = new Employee1("J",5000);
        staff1[2] = new Employee1("M",4000);

        Employee1.main(args);

        for(Employee1 i: staff1) {
            i.setId();

            System.out.println("name = " + i.getName());
        }

    }


}

class Employee1{

    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee1(String n,double s){
        name = n;
        salary =s;
        id = 0;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        id = nextId;
        nextId++;
    }

    public static int getNextId(){
        return nextId;
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1("Harry",50000);
        System.out.println(e.getName()+" "+e.getSalary());


    }
}

