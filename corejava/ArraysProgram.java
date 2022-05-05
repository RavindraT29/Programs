// Program to print addition of same number between to number in array

  public class ArraysProgram
  {
    public static void main(String args[])
   {

        int [] array1 = {1,2,3,5,6,7};
        int [] array2 = {1,8,6,5,2,7};

     for(int i=0;i<array1.length;i++)
   {
     for(int j=0;j<array2.length;j++)
   {

     if(array1[i]==array2[j])
  {
     System.out.println("The addition of same number  " + array1[i]+  "is ");
     System.out.println("array1[i]+array2[j]");

    }

}

}
}  

}