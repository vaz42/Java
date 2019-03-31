import java.util.Scanner;

public class ExpirationDate{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int total_amount = in.nextInt();
        int expired_products = in.nextInt();
        int penalty = 0;
        if(expired_products != 0){
            if(expired_products > total_amount * 30 / 100)
                penalty = 100000;
            else if(expired_products > total_amount * 10 / 100)
                penalty = 10000;
            else    
                penalty = 100;
        }
        System.out.println("Penalty: $" + penalty);
    }
}