package Collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollection implements Iterable<String>{
    private String[] elements;

    public MyCollection(String[] elements) {
        this.elements = elements;
    }

    public Iterator<String> iterator(){
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {

        private int index=0;

        public boolean hasNext() {
            return index<elements.length;
        }


        public String next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            else{
                return elements[index++];
            }
        }

    }
}
