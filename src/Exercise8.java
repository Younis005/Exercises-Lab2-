import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a;
        System.out.println("Enter any Number to get Square,Cube,and Forth power");
        a=in.nextInt();
        System.out.println("The Square is "+Math.pow(a,2));
        System.out.println("The Cube is "+Math.pow(a,5));
        System.out.println("The Forth is "+Math.pow(a,45));
    }
}
