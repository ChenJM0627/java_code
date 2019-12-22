package practice;

public class Runnable extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
