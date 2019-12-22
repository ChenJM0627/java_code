package p;

public class Runable implements Runnable {

    static int sum_t = 100;
    Object o = new Object();
    @Override
    public void run() {
        if(sum_t>0){
            play_t();
        }
    }

    public void play_t(){
        synchronized (o){
            while(sum_t>0) {
                System.out.println("正在卖出No." + sum_t + "票");
                sum_t--;
            }
        }
    }
}
