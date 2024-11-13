package Hackeranck;

import java.security.KeyStore;
import java.util.*;

public class HashMapProblems {

    public static void main(String[] args) {
        System.out.println(nbrBalloon("balloon"));
        int[] array={1,2,3,4,5};

        // Convert int[] to List<Integer>
        List<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            arrayList.add(i); // Manually adding each element
        }
        System.out.println(twoSum(arrayList,5));
    }




    public static boolean isConstructed(String constrName , String magasin){
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<magasin.length();i++){
            map.put(magasin.charAt(i),map.getOrDefault(magasin.charAt(i),0)+1);
        }

        for(int i=0;i<constrName.length();i++){
            if(!map.containsKey(constrName.charAt(i))){
                return false;
            }
            else if(map.get(constrName.charAt(i))==1){
                map.remove(constrName.charAt(i));
            }
            else{
                map.put(constrName.charAt(i),map.get(constrName.charAt(i))-1);
            }
        }
        return true;
    }


    public boolean duplicate(List<Integer> list){
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<list.size();i++){
            if(set.contains(list.get(i))){
                return true;

            }else{
                set.add(list.get(i));
            }
        }
        return false;
    }

    public static int nbrBalloon(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(containsInBallon(str.charAt(i))){
                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            }
        }
        int sum=0;
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getKey()=='l'||entry.getKey()=='o'){
                sum+=entry.getValue()/2;
            }
            else{
                sum+=entry.getValue();
            }
        }
        return sum/5;
    }
    public static  boolean containsInBallon (char c){
        if(c=='b' ||c=='a' || c=='l' || c=='o' || c=='n'){
            return true;
        }
        return false;
    }


    public static List<Integer> twoSum(List<Integer> list,int target ){
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> resultList=new ArrayList<>();
        for(int i=0;i<list.size();i++ ){
            map.put(list.get(i),i);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int y=entry.getKey();
            if(map.containsKey(target-y)){
                resultList.add(map.get(y));
                resultList.add(map.get(target-y));
                return resultList;
            }
        }
        return resultList;

    }

    public static int maxSubSequence(List<Integer> list){
        Set<Integer> set=new HashSet<>(list);
        int longest=0;
        for(int i=0;i<list.size();i++){
            if(!set.contains(list.get(i)-1)){
              i=i+1;
              int length=1;
              while(i<list.size() && set.contains(list.get(i))){
                  i=i+1;
                  length++;
              }
              longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
