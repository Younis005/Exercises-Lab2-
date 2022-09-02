import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        double A,C,I,W;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        I=in.nextDouble();
        System.out.println("Enter the width of Rectangle");
        W=in.nextDouble();
        A=I*W;
        C=2*(I+W);
        System.out.println("The Area of Rectangle is"+A);
        System.out.println("The circumference of Rectangle is"+C);
    }
}
