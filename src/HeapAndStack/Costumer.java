package HeapAndStack;

public class Costumer {
     private String name;

     public Costumer(String name) {
         this.name = name;
     }
     public Costumer(Costumer cust){
         this.name = cust.getName();
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void finalize(){
        System.out.println("this object is garbeg collected");
    }
}
