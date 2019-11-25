package charp_5;

public class p5_4 {
    public static void main(String[] args) {
        p5_3 boss = new p5_3("CJM",10000,2019,10,1);
        p5_2[] staff = new p5_2[3];
        staff[0] = boss;
        boss.setBonus(10000);

        staff[1] = new p5_2("JJ",5000,2010,10,1);
        staff[2] = new p5_2("XW",8000,2014,5,1);
        if (staff[0] instanceof p5_3)
        {
            System.out.println("1");
        };
        for(p5_2 i :staff)
        System.out.println(i.getName()+"  "+i.getSalary());
    }
}
