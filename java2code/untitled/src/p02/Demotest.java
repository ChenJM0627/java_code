package p02;

public class Demotest {
    public static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString((s)->new MethodRerObject().printUpper(s));
    }
}
