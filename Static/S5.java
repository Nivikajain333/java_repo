
// program to calculate simple interst
import java.util.Scanner;

public class S5 {

    int pa;
    float td;
    static float ri; // we make this static  because its value is fixed and if we are 
    // using this memory is crsted two times that's why we make it static
    float si;

    static 
    {
        ri=4.5f;
    }
     void input()
     {
        Scanner scan = new Scanner (System.in);
        System.out.println("please enetr amount requires");
        pa=scan.nextInt();
        System.out.println("please enetr time durations");
        td=scan.nextInt();
     }

     void compute()
     {
        si=(pa*td*ri) /100f;

     }
     void disp()
    {
        System.out.println("VALUE OF SI IS  " + si);
    }

    public static void main(String[] args) {


        S5 obj = new S5();
        S5 obj2 = new S5();
        obj.input();
        obj.compute();
        obj.disp();

        obj2.input();
        obj2.compute();
        obj2.disp();
    }
    
}
