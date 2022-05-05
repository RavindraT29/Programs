// program to print sum of all numbers in the array


public class ArrayProgramSumAll{

    public static void main(String args[]){
      
     try{
          int [] array= new int []{2,3,5,1,7,9};
          int sum=0;
          for(int i=0;i<array.length;i++){
           sum=sum+array[i];
             
             }
           System.out.println("sum"+sum);

         
         }
         catch(Exception e){

          System.out.println(e);
          }


     }

}