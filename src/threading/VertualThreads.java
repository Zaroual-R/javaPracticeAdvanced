package threading;

import java.util.ArrayList;
import java.util.List;

public class VertualThreads {
    /*public void application(){
        List<Thread> vThreads = new ArrayList<Thread>();
        int nbrThreads=100000;
        for(int i=0;i<nbrThreads;i++){
            int nvthread=i;
            Thread vthread=Thread.ofVertual.start(()->{
                int result=1;
                for(int j=0;j<10;j++){
                    result=result*j;
                }
                System.out.println("result=["+nvthread+"]"+result);
            });
            vThreads.add(vthread);
        }
        for(int i=0;i<vThreads.size();i++){
            try{
                vThreads.get(i).join();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }*/
}
