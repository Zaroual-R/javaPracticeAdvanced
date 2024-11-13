package Hackeranck;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSet {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(2);
        a.add(4);
        b.add(16);
        b.add(32);
        b.add(96);
        System.out.println(getTotalX(a, b)); // Should print 3
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int gcd,lcm;
        int count = 0;
        Collections.sort(a);
        Collections.sort(b);
        lcm =a.get(0);
        for(Integer integer: a){
            lcm=lcm(lcm,integer);
        }
        gcd=b.get(0);
        for(Integer integer: b){
            gcd=gcd(gcd,integer);
        }

        int multiple=0;
        while (multiple<=gcd){
            multiple+=lcm;
            if(gcd%multiple==0){
                count++;
            }
        }
        return count;


    }

    public static int lcm (int a, int b){
        return Math.abs(a*b)/gcd(a,b);
    }

    public static int gcd(int a,int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a=b;
            b=r;
        }
        return a;
    }
}
