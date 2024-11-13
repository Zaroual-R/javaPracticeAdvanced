package EscapingReference;

import HeapAndStack.Costumer;

public class Practice2 {
    public static void main(String[] args) {
        CustomerRecords cr=new CustomerRecords();
        cr.addCostumer(new Costumer("rachid"));
        cr.addCostumer(new Costumer("david"));

        cr.getRecordes().clear();
        for(Costumer cust:cr.getRecordes().values()){
            System.out.println(cust);
        }
    }
}
