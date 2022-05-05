// Program to check whether two arryas are equal or not


public class ArraysProgramEqualOrNot{

     public static void main(String args[]){

        int [] arr1 = new int[]{1,2,8,7,3};
        int [] arr2 = new int []{1,2,8,7,4};

        boolean isEqual=true;


         if(arr1.length == arr2.length){
           for(int i=0; i<arr1.length;i++){
           if(arr1[i]==arr2[i]){

                 isEqual=true;
              } 
             else{

                 isEqual=false;

               }
            }
          }
          else{
              isEqual=false;
           }
            if(isEqual==true){
            
             System.out.println("Arrays are equal");

             }
         else{
              System.out.println("Arrays are not equal");
             }

           }

         }
    