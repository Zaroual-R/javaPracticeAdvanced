import Collections.Etudiant;
import threading.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import Collections.CompareEtudiant;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args){
       Etudiant etd1=new Etudiant("rachid",1);
       Etudiant etd2=new Etudiant("HASSAN",2);
       Etudiant etd3=new Etudiant("achraf",3);
       Etudiant etd4=new Etudiant("sokar",4);
       Etudiant etd5=new Etudiant("samir",5);

       List<Etudiant> list=new ArrayList<>();
       list.add(etd1);
       list.add(etd4);
       list.add(etd5);
       list.add(etd2);
       list.add(etd3);

       Collections.sort(list,new CompareEtudiant());
       Iterator<Etudiant> itr=list.iterator();
       while(itr.hasNext()){
           System.out.print(itr.next().getName()+" ");
       }

   }

}