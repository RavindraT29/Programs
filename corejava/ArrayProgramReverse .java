// Print array in reverse order

 class ArrayProgramReverse {
  
  public static void main(String args[]){

    int [] array = new int[] {1,2,3,4,5};
    System.out.print("Original array is:");

   for(int element:array){

     System.out.println(element+"");
    }
    System.out.println();
    System.out.println("Array is reverse order");
   for(int i= array.length-1;i>=0;i--){

   System.out.print(array[i]+"");
   }
 
   }
}