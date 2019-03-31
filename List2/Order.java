    import java.util.Scanner;

public class Order{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        int quantity = in.nextInt();
        int sixty_percent = quantity * 60 / 100;
        int forty_percent = quantity * 40 / 100;
        if(type == 1){
            System.out.println("Quantity to be delivered: " + quantity);
            System.out.println("Order closed.");
        }
        else if(type == 2){
            System.out.println("Quantity to be delivered: " + (sixty_percent));
            System.out.println("Pending amount: " + (quantity - sixty_percent));
        }
        else{
            System.out.println("Quantity to be delivered: " + (forty_percent));
            System.out.println("Pending amount: " + (quantity - forty_percent));
        }  
    }
}