package charp_6;

import java.lang.reflect.Array;
import java.util.*;

import javax.swing.*;

import javax.swing.Timer;

public class p6_6 {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus",
        "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

    }
}
