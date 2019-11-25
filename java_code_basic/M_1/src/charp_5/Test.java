package charp_5;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("C");
        people[1] = new student("J");

        for(Person p:people){
            System.out.println(p.getName()+"  "+p.getDescription());
        }
    }
}
