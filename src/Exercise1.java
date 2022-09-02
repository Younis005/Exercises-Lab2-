import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        System.out.println("Specified Formula");
        x= input.nextInt();
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) );
    }
}

