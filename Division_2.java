import java.util.Scanner;

public class Division_2 {
    public static void main(String[] args) {
        divisor vijay = new divisor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y : ");
        vijay.divisor(sc.nextInt(), sc.nextInt());
        System.out.println("Enter the values of x y and z : ");
        vijay.divisor(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter the values of x , y , z , w : ");
        vijay.divisor(sc.nextInt(), sc.nextInt(),sc.nextInt(), sc.nextInt());
        sc.close();
    }
}
class divisor{
    void divisor(int x, int y){
        System.out.println("the division of two numbers = " + (x/y));
    }
    void divisor(int x, int y, int z){
        System.out.println("the division of three decimal numbers = " + ((x/y)/z));
    }
    void divisor(int x, int y, int z, int w) {
        System.out.println("the division of four decimal numbers = " + ((x / y) / (z / w)));
    }
}