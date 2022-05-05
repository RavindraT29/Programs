
public class DemoAutoAndUnboxing {
  
	static Integer I =10;   // Auto Boxing
	
	public static void main(String[] args) {
		 int i=I;   // Auto  UnBoxing
		 m1(i);       // Auto Boxing

	}
	public static void m1(Integer I) {
		int  k =I;         // Auto Boxing
		System.out.println(k);
		
	}

}
