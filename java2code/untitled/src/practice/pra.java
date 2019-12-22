package practice;

import java.util.Arrays;
import java.util.Comparator;

public class pra {

    public static Comparator<String> getCom() {
       /* return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o2.length() - o1.length();

            };*/
        return ((o1, o2) -> o1.length()-o2.length());





    }
    public static void main(String[]args){
            String[] arr = {"aaaa","ssd","adwsr"};

            System.out.println(Arrays.toString(arr));

            Arrays.sort(arr,getCom());

            }

}
