package doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class Doudizhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个集合
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一各存储花色，一各存储牌号
        String[] colors = {"红桃","红心","梅花","方块"};
        String[] numbers = {"A","2","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("M.Joker");
        poker.add("S.Joker");
        for(String i:colors){
            for(String n:numbers) {
                poker.add(i + n);
            }

        }


        //2.洗牌
        Collections.shuffle(poker);

        //3.发牌
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        ArrayList<String> D = new ArrayList<>();

        for(int i = 0;i<poker.size();i++){
            if(i>=51){
                D.add(poker.get(i));
            }
            if(i%3 == 0){
                A.add(poker.get(i));
            }
            else if(i%3 ==1){
                B.add(poker.get(i));
            }
            else{
                C.add(poker.get(i));
            }
        }

        int s = (int)(Math.random()*3);
        if(s == 0){
            for(String i :D)
                A.add(i);
            System.out.println("地主是A");
        }
        if(s == 1){
            for(String i :D)
                B.add(i);
            System.out.println("地主是B");
        }
        if(s == 2){
            for(String i :D)
                C.add(i);
            System.out.println("地主是C");
        }


        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(s);

    }
}
