import java.util.Scanner;
public class Division_1 {
    public static void main(String[] args) {
        divi vijay = new divi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y : ");
        vijay.divi(sc.nextInt(), sc.nextFloat());
        System.out.println("Enter the value of v and w : ");
        vijay.divi(sc.nextFloat(), sc.nextInt());
        sc.close();
    }
}
class divi{
    void divi(int x, float y){
        System.out.println("the division of two numbers = " + (x/y));
    }
    void divi(float v, int w){
        System.out.println("the division of two decimal numbers = " + (v/w));
    }

}