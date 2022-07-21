import java.util.Scanner;

public class Division_0 {
    public static void main(String[] args) {
        div vijay = new div();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x =");
        float a = sc.nextFloat();
        System.out.println("Enter value of y =");
        float b = sc.nextFloat();
        System.out.println("Enter value of v =");
        int v = sc.nextInt();
        System.out.println("Enter value of w =");
        int w = sc.nextInt();
        vijay.div(a, b);
        vijay.div(v,w);
        sc.close();
    }
}
class div{
    void div(int v, int w){
        System.out.println("the division of two numbers = " + (v/w));
    }
    void div(float x, float y){
        System.out.println("the division of two decimal numbers = " + (x/y));
    }
    }