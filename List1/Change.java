import java.util.Scanner;

public class Change{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total amount: ");
        int n = in.nextInt();
        System.out.println("$100 bills: " + n / 100);
        n %= 100;
        System.out.println(" $50 bills: " + n / 50);
        n %= 50;
        System.out.println( " $20 bills: " + n / 20);
        n %= 20;
        System.out.println(" $10 bills: " + n / 10);
        n %= 10;
        System.out.println("  $5 bills: " + n / 5);
        n %= 5;
        System.out.println("  $2 bills: " + n / 2);
        n %= 2;
        System.out.println("  $1 bills: " + n / 1);
        n %= 1;
    }
}
