//  Program to print maximum element in an array

public class ArrayProgramMaximum{

public static void main(String args[]){

 try{
      int [] arr = new int[] {1,2,6,5,8,9,4,5,6};
      int max = arr[0];
      for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i]; 

         }
   }
    System.out.println(max);
}
catch(Exception e){

       System.out.println(e);

     }

  }

}