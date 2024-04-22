// static method vs non-static method

public class S3 {

    static void disp() // static method
    {
        System.out.println("static block");

    }

    void disp2()    // non-static method
    {
        System.out.println("non-static block");
    }

    public static void main(String[] args)
    {
     S3.disp();
      S3 obj = new S3();
      obj.disp2();
      // S3.disp2(); this gives us error
      // obj.disp2(); but this works
    }
    
}
