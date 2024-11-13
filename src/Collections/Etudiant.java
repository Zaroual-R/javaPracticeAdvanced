package Collections;

public class Etudiant  implements Comparable<Etudiant>,Cloneable{
    private String name ;
    private int age;

    public Etudiant(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int  getAge(){
        return this.age;
    }

    //increasing order
    @Override
   public int compareTo(Etudiant o) {
        return o.age-this.age;
    }

    public String toString(){
        return name + " " ;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
