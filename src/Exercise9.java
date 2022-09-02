import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two integer ");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("The sum is "+(a+b));
        System.out.println("The difference is "+(a-b));
        System.out.println("The product is "+(a*b));
        System.out.println("The average is "+(a+b)/2);
        System.out.println("The distance is "+Math.abs(a-b));
        System.out.println("The Max value is "+Math.max(a,b));
        System.out.println("The Min value is "+Math.min(a,b));
    }
}
