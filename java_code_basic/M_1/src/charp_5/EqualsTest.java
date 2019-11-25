package charp_5;

public class EqualsTest {
    public static void main(String[] args) {
        {
            Employee01 alice1 = new Employee01("Alice", 75000, 1987, 12, 15);
            Employee01 alice2 = alice1;
            Employee01 alice3 = new Employee01("Alice", 75000, 1987, 12, 15);
            Employee01 bob = new Employee01("Bob", 50000, 1989, 10, 1);

            System.out.println("alice1 == alice2" + (alice1 == alice2));//return 1

            System.out.println("alice1 == alice3" + (alice1 == alice3));//return false

            System.out.println("alice1.equals(alice3):  " + alice1.equals(alice3));//return ture

            System.out.println("alice1.equals(bob):  " + alice1.equals(bob));//return false

            System.out.println("bob.toString():  " + bob);//return Bob +bonus = 0

            Manager carl = new Manager("Carl", 80000, 1987, 12, 15);
            Manager boss = new Manager("Carl", 80000, 1987, 12, 15);
            boss.setBonus(5000);
            System.out.println("boss.toString():  " + boss);//return Bob +bonus = 5000
            System.out.println("carl.equals(boss)" + carl.equals(boss));//return false
            System.out.println("alice1.hashCode():  " + alice1.hashCode());//return ...
            System.out.println("alice3.hashCode():  " + alice3.hashCode());//return ...
            System.out.println("bob.hashCode():  " + bob.hashCode());//return ....
            System.out.println("carl.hashCode():  " + carl.hashCode());//return ....

        }
    }
}
