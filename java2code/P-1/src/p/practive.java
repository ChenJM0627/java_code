package p;

public class practive{
    public static void main(String[] args) {
       Object obj = new Object();

       new Thread(){
           @Override
           public void run() {
               System.out.println("种类和数量");
               synchronized (obj) {
                   try {
                       obj.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("ok");
               }
           }

       }.start();

       new Thread(){
           @Override
           public void run() {
               synchronized (obj) {
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("在做了");

                   obj.notify();
               }
           }
       }.start();


    }

}
