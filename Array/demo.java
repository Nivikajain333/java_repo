 class Calc {
    public int add(int n1, int n2)
    {
        int res = n1+n2;
        return res;
    }
    public class Demo{
    public static void main(String[] args ){
    
    Calc obj = new Calc();
    int result = obj.add(3,4);
    System.out.println(result);

}
}
 }