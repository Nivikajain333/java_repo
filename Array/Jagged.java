public class Jagged {
    

    public static void main(String[] args){

    int nums[][]  = new int[3][]; //declaration of 2d array
      nums[0]=new int [4]; // declaration of column in array
      nums[0]=new int [2];
      nums[0]=new int [3]; 


    /*int nums[][] = {
        {5,2,3,6},
        {8,3},
        {9,4,8}
         }; */

for(int i=0; i<=2; i++ )   //outer  loop for rows
{
for(int j=0; j<nums[i].length; j++)  // inner  loop for column
{
System.out.print(nums[i][j] + " ");  //simpling printing
}
System.out.println(); //for printing the value in the next line when needed
}

}

}


