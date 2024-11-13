package CommonProblem;

import java.util.Collections;

public class StrToNumber {
    private static final int maxDiv10=Integer.MAX_VALUE/10;

    public static void main(String[] args) {
        System.out.println(strToInt("     1234racid"));
    }

    public static int strToInt(String str) {
        int i=0,n=str.length();
        while(i<n && Character.isWhitespace(str.charAt(i))) i++;
        int sign=1;
        if(str.charAt(i)=='+') i++;
        if(str.charAt(i)=='-') {
            sign=-1;
            i++;
        }
        int num=0;
        while(i<n && Character.isDigit(str.charAt(i))){
           int digit=Character.getNumericValue(str.charAt(i));
           if(digit>maxDiv10 || (digit==maxDiv10 && digit>=8)){
               return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
           }
           num=num*10+digit;
           i++;
        }
        return sign*num;

    }


    public static boolean isNumeric(String str) {
        int i=0,n=str.length();
        while(i<n && Character.isWhitespace(str.charAt(i))) i++;
        if(i<n && str.charAt(i)=='+' || str.charAt(i)=='-') i++;
        boolean isNumeric =false;
        while(i<n && Character.isDigit(str.charAt(i))){
            isNumeric =true;
            i++;
        }
        if(str.charAt(i)=='.'){
            i++;
            while(i<n && Character.isDigit(str.charAt(i))){
                isNumeric =true;
                i++;
            }
        }
        while(i<n && Character.isWhitespace(str.charAt(i)))i++;

        return isNumeric && i==n;
    }

}
