package Collections;

import javax.swing.plaf.PanelUI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lists {
    public static void main(String[] args){
        //creating a list
        List<Integer> list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);

        ListIterator<Integer> itr=list.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("");
        ListIterator<Integer> itr2=list.listIterator();
        while(itr2.hasNext()){
            if(itr2.next()==3){
                itr2.add(4);
            }
        }
        System.out.println("");

        ListIterator<Integer> itr3=list.listIterator();
        while(itr3.hasNext()){
            System.out.print(itr3.next()+" ");
        }





        //c













    }
}
