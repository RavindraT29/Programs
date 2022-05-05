import java.util.ArrayList;
import java.util.Collections;



public class Main {

	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<Student>();
		list.add(new Student("Ravindra", 24,23));
		list.add(new Student("Akash", 23,21));
		list.add(new Student("Rakesh", 20,18));
		
		//Collections.sort(list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(Student str:list) {
			System.out.println(str);
			
		}
		
	}

}
