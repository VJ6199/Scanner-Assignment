import java.util.Scanner;
public class College {
    public static void main(String[] args) {
        Professor vijay = new Professor();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String a = sc.next();
        vijay.giveprofessorName(a);
        System.out.println("enter specialization");
        String b = sc.next();
        vijay.giveprofessorName(a,b);
        System.out.println("enter experience");
        String c = sc.next();
        vijay.giveprofessorName(a,b,c);
        System.out.println("contact number");
        int d = sc.nextInt();
        vijay.giveprofessorName(a,b,c,d);
        System.out.println("Age");
        int e = sc.nextInt();
        vijay.giveprofessorName(a,b,c,d,e);
        sc.close();
    }
}
class Professor{
    void giveprofessorName(String name){
        System.out.println("name = " +name);
    }
    void giveprofessorName(String name, String specialization) {
        System.out.println("name = " +name + ", specialization = " + specialization);
    }
    void giveprofessorName(String name, String specialization, String experience) {
        System.out.println("name = " +name + ", specialization = " + specialization + ", experience = " + experience);
    }
    void giveprofessorName(String name, String specialization, String experience, int contactnumber) {
        System.out.println("name = " +name + ", specialization = " + specialization + ", experience = " + experience +  ", contactnymber = " + contactnumber);
    }
    void giveprofessorName(String name, String specialization, String experience, int contactnumber, int age) {
        System.out.println("name = " +name + ", specialization = " + specialization + ", experience = " + experience +  ", contactnymber = " + contactnumber + ", age = " + age);
    }
}