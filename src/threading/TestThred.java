package threading;

public class TestThred implements Runnable {
    private int count =1;

    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+" " +count++);
            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
