package threading;

import java.io.InterruptedIOException;

public class Sync {
    public synchronized void print(int count)   {
        for(int i=1;i<10;i++){
            System.out.println(count*i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.getMessage();
            }
        }

    }
}
