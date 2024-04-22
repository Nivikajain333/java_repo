public class Twod {
    // 2d array for 3rows and 2 columns
    public static void main(String[] args)
    {                         

                          //  row column
    // int nums[][]  = new int[3][2]; //declaration of 2d array
    /*  nums[0][0] = 2;               // intialisation of 2d array
     nums[0][1] = 3;
     nums[1][1] = 4;
     nums[1][0] = 5;
     nums[2][1] = 1;
     nums[2][0] = 6; 
     
     */
 
 
     /* System.out.println(nums[0][0]);
    System.out.println(nums[0][1]);
    System.out.println(nums[1][1]);
    System.out.println(nums[1][0]);
    System.out.println(nums[2][1]);
    System.out.println(nums[2][0]);*/

    //or
    int nums[][] = {
                  {5,2},
                  {8,3},
                  {9,4}
                   };

    for(int i=0; i<=2; i++ )   //outer  loop for rows
    {
      for(int j=0; j<=1; j++)  // inner  loop for column
      {
      System.out.print(nums[i][j] + " ");  //simpling printing
    }
     System.out.println(); //for printing the value in the next line when needed
    }
    
}
}
