package charp_5;

public class student extends Person{

        public student(String name){
            super(name);
        }

        @Override
        public String getDescription() {
            return String.format("description of student");
        }


}
