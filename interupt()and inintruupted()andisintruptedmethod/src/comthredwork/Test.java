package comthredwork;

public class Test  extends Thread{
	
	public void run() {
		//System.out.println("A:"+Thread.interrupted()); //true -> false
		//System.out.println("A:"+Thread.interrupted()); //false
		System.out.println("B1:"+Thread.currentThread().isInterrupted()); //true -> true
		System.out.println("B2:"+Thread.currentThread().isInterrupted()); //true -> true
		try {
			for(int i=1; i<=10; i++) {
				System.out.println(i);
				Thread.sleep(1000);
				//System.out.println(":"+Thread.interrupted());
			}
			
		}
		catch(Exception e) {
			System.out.println("Thred Intrupted :" +e);
		}
		
	}

	public static void main(String[] args) {
		Test test=new Test();
		test.start();
		test.interrupt();

	}

}
