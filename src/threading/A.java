package threading;

public class A implements  Runnable{
    RentrantLockClass s;
    public A (RentrantLockClass S){
        this.s = S;
    }
    @Override
    public void run() {
        s.print(2);
    }
}
