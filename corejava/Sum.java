public class Sum
{

public static void main(String args[]){


  int[] array1 = new int[]{5,4,1,0,7};
  int[] array2 = new int[]{7,5,9,4,8};
  int sum=0;
   
 for(int i=0;i<array1.length;i++)
{
  for(int j=0;j<array2.length;j++)
{
 if(array1[i]==array2[j])
{
   sum+=array2[j];

}
 
}

}
System.out.println(sum);

 

}
}