package charp_4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class p4_1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);//获得当前日期的前n天
        DayOfWeek weekday = date.getDayOfWeek();//得到当前日期为星期几，并作为DayOfWeek的一个实例返回
        int value = weekday.getValue();


        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i<value;i++)
            System.out.print("    ");

        while(date.getMonthValue() == month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            DayOfWeek w = date.getDayOfWeek();
            int v = w.getValue();
            if(v == 7)
            {
                System.out.println();
            }
            if(date.getDayOfMonth()==today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);


        }

    }

}
