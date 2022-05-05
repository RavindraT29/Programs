// Program to calculate average of all values in array

   public class ArrayProgramAverage{

    public static void main(String args[]){

       int [] array= new int []{2,3,8,4,5,7};
       int sum=0;
       for(int i=0;i<array.length;i++){
         sum=sum+array[i];

       }
      int average = sum+array.length;
      System.out.println("The average of elements of array :"+average);

     }

}