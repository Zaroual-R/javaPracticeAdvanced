package CommonProblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Algo {
    public static void main(String[] args) {
        System.out.println(check("({}){}[])"));
    }


    //calculate the factoriel of a number ;
    public static int factoriel(int n ){
        if(n == 1) return 1;
        int result = n*factoriel(n-1);
        return result;
    }

    //calculate the fibonacci of a number
    public static int fibonacci(int n) {
        if(n==0 || n==1) return n;
        int[] arr=new int[n];
        int mem= fibonacci(n-1)+fibonacci(n-2);
        arr[n-1]=mem;
        return mem; 
    }



    public static  boolean check(String str){
        char[] arr=new char[str.length()];
        arr=str.toCharArray();
        Stack<Character> myStack=new Stack<>();
        for(int i=0 ; i<arr.length ; i++){
            // check if the character is an opening bracket if it is push it into the stack
            if(arr[i]=='{' || arr[i]=='[' || arr[i]=='(') {
                myStack.push(arr[i]);
            }
            //if the current character is a clousing bracket
            else if(arr[i]=='}' || arr[i]==']' || arr[i]==')'){
                // if a stack is empty when clousing  bracker is encountred then return false
                // because that is mean there is no matching opening bracket for the clause one
                if(myStack.isEmpty()) return false;
                Character ch=myStack.peek();
                // this condition checks if the top element of the stack matches the correspondant openning
                // bracket for the current clausing bracket
                if((ch== '{' && arr[i]=='}') ||(ch== '(' && arr[i]==')') || (ch== '[' && arr[i]==']')){
                    // if it is it removes the top element of the stack
                    myStack.pop();
                }
                // if the bracket are not matched it returns false that means the brackets are not balances
                else{
                    return false;
                }
            }
        }
        if(myStack.isEmpty()){
             return true;
        }else{
             return false;
        }
    }


}
