// Copying all elements of one array to another array

 public class ArrayProgramCopy{

       public static void main(String args[]){

          int [] array1 = new int[] {1,5,6,2,3,4};
          int [] array2 = new int[array1.length];

    for(int i=0; i<array1.length;i++){
      array2[i]=array1[i];
      
      }
     for(int ele:array1){

    System.out.print(ele+"");
   }
    System.out.println();
   for(int elements:array2){


       System.out.println(elements+"");
       }
     }

          
   }
