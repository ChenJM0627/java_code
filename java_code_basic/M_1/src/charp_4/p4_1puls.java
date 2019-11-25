package charp_4;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class p4_1puls {
    public static void main(String[] args) {



    LocalDate date = LocalDate.now();
    int month = date.getMonthValue();
    int today = date.getDayOfMonth();

    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

    date = date.minusDays(today-1);

    DayOfWeek d = date.getDayOfWeek();
    int n = d.getValue();
    int s = 7-n;

    for(int i = 0;i<7;i--){
        if(i==s)
            break;
        System.out.print("    ");

    }

    while(date.getMonthValue() == month){
        System.out.print(date.getDayOfMonth());
        if(date.getDayOfMonth() == today)
            System.out.print("*  ");

        DayOfWeek d1 = date.getDayOfWeek();
        int n1 = d.getValue();

        if(n1 ==6)
            System.out.println();

        System.out.print("   ");
        date = date.plusDays(1);
    }

}
}
