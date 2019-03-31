import java.util.Scanner;

public class CostumeCompetition{
    public static void main(String[] args){
        int jury[] = new int[3];
        Scanner in = new Scanner(System.in);
        jury[0] = in.nextInt();
        jury[1] = in.nextInt();
        jury[2] = in.nextInt();
        if((jury[0] > jury[1] && jury[0] < jury[2]) || (jury[0] < jury[1] && jury[0] > jury[2]))
            System.out.println(jury[0]);
        else if((jury[1] > jury[2] && jury[1] < jury[0]) || (jury[1] < jury[2] && jury[1] > jury[0]))
            System.out.println(jury[1]);
        else if((jury[2] > jury[1] && jury[2] < jury[0]) || (jury[2] < jury[1] && jury[2] > jury[0]))
            System.out.println(jury[2]);
    }
}