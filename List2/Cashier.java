import java.util.Scanner;

public class Cashier{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total value and the type of payment: ");
        int value = in.nextInt();
        int type = in.nextInt();
        if(type == 3){
            int payment = in.nextInt();
            if(value - payment == 0)
                System.out.println("No change.");
            else
                System.out.println("Change: " + (payment - value));
        }
        else
            System.out.println("No change.");
    }
}