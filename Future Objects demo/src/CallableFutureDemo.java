import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		ExecutorService excutorservice = Executors.newFixedThreadPool(10);
		
		List<Future<Integer>> list = new ArrayList<>();
		
		for(int i=0;i < 100; i++) {
	   // Future<Integer> future =excutorservice.submit(new SumCallable(10));
	       Future<Integer> future =excutorservice.submit(new SumCallable(i));
	       list.add(future);
	    
		}
		for(Future f : list) {
			//System.out.println(f.get());
			System.out.println(f.get(2,TimeUnit.SECONDS));

		}
	   

	}

}
