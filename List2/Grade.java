import java.util.Scanner;

public class Grade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double reg = in.nextDouble();
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        System.out.println("Registration: " + reg);
        double m = (n1 + n2) / 2;
        if(m < 5)
            if(m < 3)
                System.out.println("\nFailed");
            else
                System.out.println("\nRetake Test");        
        else
            System.out.println("\nPassed");
            if(m > 9)
                System.out.println("\nCongrats!");
    }
}