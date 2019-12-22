package p;

public class test {
    static int  baozi_number = 0;
    public static void main(String[] args) {


        baozi baozi = new baozi();

        baizipu baozipu = new baizipu(baozi);
        Thread t0 = new Thread(baozipu);
        Thread t1 = new Thread(baozi);

        t0.start();
        t1.start();


    }
}
