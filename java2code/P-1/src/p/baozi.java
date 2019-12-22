package p;

public class baozi extends Thread{

    public int baozi_number = 0;
    baozi(){

    }

    @Override
    public void run() {
        synchronized (this){
            while(true) {
                if (baozi_number == 0) {
                    try {
                        System.out.println("老板，我要包子");
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
                System.out.println("有包子吃le");
                baozi_number--;
                this.notify();
            }
        }


    }
}
