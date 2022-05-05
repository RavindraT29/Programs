// Program to sort array element in ascending order


public class ArrayProgramSort{

  public static void  main(String args[]){

   int [] arr= new int []{6,1,4,78,52,4,9,2};
   int temp=0;
   System.out.println("Element of original array:");

   for(int i=0;i<arr.length;i++){

    System.out.println(arr[i]+" ");
   
      }
     System.out.println();
     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]>arr[j]){
           temp= arr[i];
           temp= arr[j];
           arr[j]= temp;

         }

       }
       System.out.println(arr[i]+" ");

        }



    }



}