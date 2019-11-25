package charp_5;

public class p5_3 extends p5_2{
    private double bonus;

    public p5_3(String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        bonus =0;
    }

    public  double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }

}
