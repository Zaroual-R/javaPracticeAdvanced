package CommonProblem;

public class WordReverse {

    public static  void main(String[] args) {
        String word = "zaroual rachid hello";
        System.out.println("split approach :"+ wordReverse(word));
        System.out.println("two-pass approach :"+ wordReverse2(word));
        System.out.println("without allocatin extra space approach:"+wordReverse3(word.toCharArray()));
    }

    //using the two-pass aproach
    //this proash start by split the string by space end the then  pass to extract words in reverse order

    public static  String wordReverse(String word) {
        StringBuffer sb=new StringBuffer();
        String[] words=word.split(" ");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }


    //  Using the second aproach with is one-pass wich is iterating the string in reverse order we keep
    // tracking of a word bedin and end postion, when we are at the begining of word we append it

    public static String wordReverse2(String word) {
        StringBuffer sb=new StringBuffer();
        int j=word.length();
        for(int i=word.length()-1;i>=0;i--){
            if(word.charAt(i)==' '){
                j=i;
            }
            else if(i==0 || word.charAt(i-1)==' '){
                sb.append(word.substring(i,j));
                if(i!=0){
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }


    // how we can solve this probleme without allocating extra space
    //notice that if we reverse a string twice we will get the same string

    public static String wordReverse3(char[] word) {
        reverse(word,0,word.length-1);
        int j=0;
        for(int i=0;i<word.length;i++){
            if(word[i]==' ' || i==word.length-1){
                reverse(word,j,(i==word.length-1)?i:i-1);
                j=i+1;
            }
        }
        return new String(word);
    }

    public static void reverse(char[] word,int start, int end) {
       int i=start;
       int j=end;
       while(i<j){
           char temp=word[i];
           word[i]=word[j];
           word[j]=temp;
           i++;
           j--;
       }
    }
}
