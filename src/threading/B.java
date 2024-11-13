package threading;

public class B implements Runnable{
    RentrantLockClass s;;

    public B (RentrantLockClass S){
        this.s = S;
    }
    @Override
    public void run() {
        s.print(2);
    }
}
