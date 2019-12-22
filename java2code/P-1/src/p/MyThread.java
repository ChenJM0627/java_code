package p;
//若要开启线程，必须要重写父类Thread中的run方法
public class MyThread extends Thread{

    public  void MyThread(){

    }
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
