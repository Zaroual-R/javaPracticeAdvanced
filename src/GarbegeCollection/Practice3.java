package GarbegeCollection;

import HeapAndStack.Costumer;

public class Practice3 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Long availableMemory=runtime.freeMemory();
        System.out.println("availableMemory="+availableMemory/1024+"ko");


        for(int i=0;i<1000000;i++){
            Costumer c;
            c=new Costumer("pach");
        }

        availableMemory=runtime.freeMemory();
        System.out.println("availableMemory="+availableMemory/1024+"ko");

        System.gc();

        availableMemory=runtime.freeMemory();
        System.out.println("availableMemory="+availableMemory/1024+"ko");

    }


}
