package practice01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;

public class pr02 {
    public static int getmax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {

        int[] arr = {100,0,-42,54,645,-52};
        int Max = getmax(()->{
            int max = 0;
            for (int i:arr) {

                if(i>max){
                    max = i;

                }
                
            }
            return max;
        });

        System.out.println(Max);
    }
    
}
