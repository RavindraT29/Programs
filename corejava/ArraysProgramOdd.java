// To print elments present on add postion in an array

public class ArraysProgramOdd{

   public static void main(String args[]){
   

   try{
    int [] array = new int []{2,3,5,4,6,2,8,6,4,5,2,6};
    System.out.println("elements at odd position are:");
    for(int i=0; i<array.length;i=i+2){

       System.out.print(array[i]+" ");
         }
   
     }
  catch(Exception e){

     System.out.println("Index aukat se bahar ja raha hai bhai");
     }
   }
}