package Hackeranck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigratoryBird {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(4);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(2);
        a.add(5);

        System.out.println(migratoryBirds(a));

    }

    public static int migratoryBirds(List<Integer> arr) {
        int mostFrequentlyUsed=1;
        int[] frequency=new int [6];
        frequency[0]=0;
        for(int i=0;i<arr.size();i++){
            frequency[arr.get(i)]++;
        }
        for(int i=2;i<frequency.length;i++){
            if(frequency[i]>frequency[mostFrequentlyUsed]){
                mostFrequentlyUsed=i;
            }
        }
        return mostFrequentlyUsed;

    }
}
