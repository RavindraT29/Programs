// Smallest element in array

public class ArrayProgramSmallest{

   public static void main(String args[]){
     
      try{
        int [] array= new int[] {5,2,9,1,7,5,6,1,4,7};
        int min =array[0];
        for(int i=0;i<array.length;i++)

         {

         if(array[i]<min){
 
           min = array[i];
              }

           }
             System.out.println("The smallest number in array is:"+min);

         }
      catch(Exception e){
     
     System.out.println(e);
    }

  }
}