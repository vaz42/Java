import java.util.Scanner;

public class Soccer{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int code1 = in.nextInt();
        int goals1 = in.nextInt();
        int code2 = in.nextInt();
        int goals2 = in.nextInt();
        if(goals1 > goals2)
            System.out.println("Winner: #" + code1);
        else if(goals1 < goals2)
            System.out.println("Winner: #" + code2);
        else
            System.out.println("Draw");
    }
}