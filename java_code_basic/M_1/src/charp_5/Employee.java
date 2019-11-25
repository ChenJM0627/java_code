package charp_5;

public class Employee extends Person{
        private double salary;

        public Employee(String name){
            super(name);
        }

        @Override
        public String getDescription() {
            return String.format("description of employee");
        }

}
