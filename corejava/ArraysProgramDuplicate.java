// Program to print duplicate elements of array

   public class ArraysProgramDuplicate{

     public static void main(String args[]){

       int [] array1 = new int[] {2,5,4,3,8,7,10};
       int [] array2 = new int[] {3,5,8,10,4,5,3};

     for(int i=0;i<array1.length;i++){
          for(int j=0;j<array2.length;j++){

            if(array1[i]==array2[j]){

                 System.out.println(array1[i]);
                  }
             }
        }
    }
  }