import java.util.Scanner;

public class Airline{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int assumed = in.nextInt();
        int real = in.nextInt();
        if(assumed - real > 0)
            System.out.println("Early flight.");
        else if(assumed - real < 0)
            System.out.println("Delayed flight.");
        else
            System.out.println("Flight on time.");
    }
}