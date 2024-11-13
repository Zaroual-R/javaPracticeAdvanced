package Collections;

import java.util.*;

public class SetColl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Etudiant etd1=new Etudiant("rachid",1);
        Etudiant etd2=new Etudiant("HASSAN",2);
        Etudiant etd3=new Etudiant("achraf",3);
        Etudiant etd4=new Etudiant("sokar",4);
        Etudiant etd5=(Etudiant) etd1.clone();

        Map<String , Integer > map=new HashMap<>();

        map.put(etd1.getName(),1);
        map.put(etd2.getName(),2);
        map.put(etd3.getName(),3);
        map.put(etd4.getName(),4);


        Set<Etudiant> set=new TreeSet<>(new CompareEtudiant());
        set.add(etd1);
        set.add(etd2);
        set.add(etd4);
        set.add(etd5);
        set.add(etd3);

        /*System.out.println(set);
        Iterator<Etudiant> itr=set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next().getName()+" ");
        }*/


        System.out.println("contains rachid in map "+map.containsKey("rachid"));

        Set<String> keys=map.keySet();

        



    }
}
