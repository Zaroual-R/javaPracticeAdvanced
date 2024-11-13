package Hackeranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        List<Integer> result =new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        System.out.println( rotateLeft(4,result));
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int n=arr.size();
        Integer[] res=new Integer[n];
        if(d!=n){
            for(int j=n-1;j>=0;j--){
                if(j>=d){
                    res[j-d]=arr.get(j);
                }
                else{
                    res[n-d+j]=arr.get(j);
                }
            }
        }else{
            return arr;
        }
        return Arrays.asList(res);

    }
}
