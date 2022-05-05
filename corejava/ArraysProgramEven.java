// To Print elements present on even position in an array
   public class ArraysProgramEven{

   public static void main(String args[]){

     int [] array= new int[]{5,4,8,2,6,9,4,5,7,8,2,5,6,5};
     System.out.println("numbers at event positions are: ");
   
  for(int i=1;i<=array.length;i=i+2){

      System.out.print(array[i]+ " ");
      }
    
     }
 }