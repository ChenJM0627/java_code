package practice01;
/*

 */

import java.util.function.Supplier;

public class pr01 {
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(()->{
            return "return";
        });

        System.out.println(s);
    }

}
