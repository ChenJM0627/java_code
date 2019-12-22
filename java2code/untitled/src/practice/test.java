package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        es.submit(new Runnable());
        es.submit(new Runnable());
        es.submit(new Runnable());
        es.submit(new Runnable());
    }
}
