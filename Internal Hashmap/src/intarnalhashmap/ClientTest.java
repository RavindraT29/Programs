package intarnalhashmap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientTest {

	public static void main(String[] args) {
       ExecutorService excutorService =  null;
       try {
    	   excutorService = Executors.newFixedThreadPool(3);
    	   
    	   final Counter counter = new Counter();
    	   Runnable task1 = new Runnable() {

			@Override
			public void run() {
				for(int i = 1; i<1000; i++) {
			       counter.increment();	
				}
				
			}
    		   
    	   };
    	   
    	   Runnable task2 = new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<= 2000; i++) {
					counter.increment();
				}
				
			}
    		   
    	   };
    	   excutorService.submit(task1);
    	   excutorService.submit(task2);
    	   excutorService.awaitTermination(3,TimeUnit.SECONDS);
    	   System.out.println(counter.getCount());
    	  
       }catch (Exception e) {
    	   e.printStackTrace();
       }finally {
    	   if(excutorService != null)
    		   excutorService.shutdown();
       }
    
   

	}

}
