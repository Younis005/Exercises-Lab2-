import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int a,b,c,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("enter three Number");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        avg=a+b+c/3;
        System.out.println("the Average is"+avg);

    }
}
