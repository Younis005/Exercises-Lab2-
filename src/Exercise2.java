import java.util.Scanner;
import java.io.*;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        double r,a,p;
        System.out.println("Enter the radius of the circle");
        r=kb.nextDouble();
        a=3.14*r*r;
        p=2*3.14*r;
        System.out.println("The area of the circle is"+a);
        System.out.println("The perimeter of the circle is "+p);


    }
}
