import java.util.Scanner;

public class TheHighest{
    public static void main(String[] args){
        int n[] = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter with 3 numbers: ");
        n[0] = in.nextInt();
        n[1] = in.nextInt();
        n[2] = in.nextInt();
        System.out.print("The highest number is: ");
        if(n[0] > n[1])
            if(n[0] > n[2])
                System.out.println(n[0]);
            else
                System.out.println(n[2]);
        else
            if(n[1] > n[2])
                System.out.println(n[1]);
            else
                System.out.println(n[2]);
    }
}