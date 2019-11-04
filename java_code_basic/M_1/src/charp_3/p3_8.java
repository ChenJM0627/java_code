package charp_3;

public class p3_8 {
    public static void main(String[] args) {
        double[] Rate = new double[6];
        for(int i =0;i<Rate.length;i++)
            Rate[i] = (10+i)/100.0;

        double [][] balances = new double[10][6];

        for(int i = 0;i<balances[0].length;i++) {
            balances[0][i] = 10000;
        }


        for(int i = 1; i<balances.length;i++)
        {
            for(int j = 0;j<balances[i].length;j++)
            {
                double oldbanlances = balances[i-1][j];
                double interest = oldbanlances*Rate[j];

                balances[i][j] = oldbanlances+interest;
            }
        }

        for(int i =0;i<Rate.length;i++){
            System.out.printf("%9.0f%% ", 100 * Rate[i]);
         }


        System.out.println("");
        //输出二维数组
        for(double[] i : balances)
        {
            for(double j:i)
                System.out.println(j);
        }


    }
}
