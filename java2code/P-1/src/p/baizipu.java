package p;

public class baizipu extends Thread{

    private baozi baozi;
    private boolean flag;

    public baizipu(baozi baozi){

        this.baozi = baozi;


    }


    @Override
    public void run() {
        while(true) {
            synchronized (baozi) {
                while(true) {
                    if (baozi.baozi_number != 0) {

                        try {
                            baozi.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }



                    } else {
                        System.out.println("我马上开始做");
                        try {
                            sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        baozi.baozi_number++;

                        baozi.notify();
                        System.out.println("包子做好了");

                    }


                }
            }


        }
    }
}
