public class Enhance {

    public static void main(String[] args)
    {
      int nums[] = {5,3,6,8}; //for 1d aaray
      for(int n : nums)
      {
        System.out.print(n);
      }


      int num[][] = {
                 {5,6,7,8},
                 {2,9,0,1},
                 {1,3,5,6}


      };
      for(int a[]: num)
      {
        for(int b :a)
        System.out.print(b+ "  ");
      }
      System.out.println( );

    }
    
}
