package HeapAndStack;
/* 1-in java variable pasiing into methode are passeb by value that is mean that another copy of
*  this vaiable will be created
* 2-noteced that in java that are passing into methode ,the reference of object are passec also by value not
* the object it self
* 3-int the example below the integer nbr is passed by value into methode calculate that's means that
* another variable will be created in the stack (its copie) and the any modefication of nbeCopied will
* not effect the variable nbr
*4- in printCustomer methode  we create a customer object and we pass it into modifyCustomer methode
* and what hepped acualy is that we pass the reference of our customer object to this methode by value
* that is meas that a copie of c wich is cust was creatd in stack  and pointer into the same object of c */


public class Reference {
    public void printNumber() {
        int nbr = 5;
        calculate(nbr);
        System.out.println(nbr);
    }

    public void calculate(int nbrCopied) {
        nbrCopied = nbrCopied + 1;
    }


    public void printCutomer() {
        Costumer c = new Costumer("rachid");
        modifyCustomer(c);
        System.out.println(c.getName());

    }

    public void modifyCustomer(Costumer cust) {
        cust.setName("miloud");
    }
}

