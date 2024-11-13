package threading;

public class StopRannuble implements Runnable{
    private boolean  requestedStop=false;
    public void synchronizedRunnable(){
        this.requestedStop=true;
    }

    public boolean isRequestedStop() {
        return requestedStop;
    }

    public void sleep (int millis ){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e){
            System.out.println(e.fillInStackTrace());
        }
    }

    @Override
    public void run(){
        System.out.println("stop runnable is running");
        while(! isRequestedStop()){
            sleep(1000);
            System.out.println("....");
        }
        System.out.println("stop rubbable have stopped");
    }
}
/* IMPLEMENTATION : how to stop a thread your self using stopRunnable class */
/* public class Main {
    public static void main(String[] args) {
     StopRannuble stopRannuble = new StopRannuble();
     Thread thread = new Thread(stopRannuble);
     thread.start();
     try{
         Thread.sleep(5000);
     }catch (InterruptedException e){
         System.out.println(e.getMessage());
     }
        System.out.println("requestion stop");
        stopRannuble.synchronizedRunnable();
        System.out.println("stop requested");
    }
}*/
