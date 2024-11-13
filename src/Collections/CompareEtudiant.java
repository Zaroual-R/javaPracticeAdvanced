package Collections;

import java.util.Comparator;

public class CompareEtudiant implements Comparator<Etudiant> {


    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        if(o1.getAge()>o2.getAge()){
            return 1;
        }
        else if(o1.getAge()<o2.getAge()){
            return -1;
        }
        else{
            return 0;
        }

    }
}
