package EscapingReference;

import HeapAndStack.Costumer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* if you want to return reference to a collection  you have to return a unmodifyable copy of this collection*/
public class CustomerRecords implements Iterable<Costumer>{
    private Map<String , Costumer> recordes;
    public CustomerRecords() {
        recordes = new HashMap<String , Costumer>();
    }
    public void addCostumer(Costumer costumer) {
        this.recordes.put(costumer.getName(), costumer);
    }
    public Map<String , Costumer> getRecordes() {
         // return this.recordes; it is not a safe code because we can return the map and clear it so we break the incapsulation
        //return new HashMap<String,Costumer>(this.recordes); but still not the elegant solution
        return Collections.unmodifiableMap(recordes);//will creat for us a copy of original map and this copy can not be edited(UnseportedOperationException)
    }
    @Override
    public Iterator<Costumer> iterator() {
        return this.recordes.values().iterator();
    }

    public Costumer getCostumerByName(String name) {
        return new Costumer(this.recordes.get(name));
        //here we avoid the escaping reference to do not keep other variable to change the velue of customers from outside
        //so if the object is not immutable you have not to get its reference in get methode beceause that
        //will espcape reference
    }
}
