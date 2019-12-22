package practice01;

import java.util.*;


import java.util.function.Supplier;


import java.util.stream.Stream;

public class pr03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> steam1 = list.stream();

        Map<String,String> map = new HashMap<>();
        Set<String> set = map.keySet();
        Stream<String> steam2 = set.stream();

        Collection<String> values = map.values();
        Stream<String> steam3 = values.stream();

        Stream<Integer> stream0 = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> s = stream0.filter((Integer a)-> {return a>2;} );

        Stream<String> string = s.map(o -> String.valueOf(o));

        string.forEach(i-> System.out.println(i));

    }
}
