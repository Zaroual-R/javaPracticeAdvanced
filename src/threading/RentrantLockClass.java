package threading;

import java.util.concurrent.locks.ReentrantLock;

public class RentrantLockClass {
    ReentrantLock lock =new ReentrantLock();
    public void print(int count)  {
        lock.lock();
        for(int i=1;i<10;i++){
            System.out.println(count*i);
            try {
                Thread.sleep(500);
            }catch( InterruptedException e){
                System.out.println(e.getMessage());
            }finally {
                lock.unlock();
            }
        }
    }
}
