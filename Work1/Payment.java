import java.util.Scanner;
public class Payment{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Registration number: ");
        String reg = in.next();

        System.out.println("Gross salary: ");
        double grossSalary = in.nextDouble();

        System.out.println("Extra hours: ");
        int xHours = in.nextInt();

        System.out.println("Overdue hours: ");
        int overHours = in.nextInt();

        System.out.println("Working hour value: ");
        double hourValue = in.nextDouble();

        System.out.println("Day care center aid dependents: ");
        int dependents = in.nextInt();

        System.out.println("Lenght of service: ");
        int lenghtOfService = in.nextInt();

        in.close();

        double lenghtOfServiceBonus = lenghtOfService * grossSalary * 2 / 100.0;
        int dccAid = dependents * 55;
        double xHoursBonus = xHours * hourValue;
        double overHoursDiscount = overHours * hourValue;

        double inssDiscount;
        double incomeTaxDiscount;

        if(grossSalary <= 1751.81)
            inssDiscount = 8;
        else if(grossSalary <= 2919.72)
            inssDiscount = 9;
        else    
            inssDiscount = 11;
        inssDiscount *= grossSalary / 100;
        if(inssDiscount >= 642.34)
            inssDiscount = 642.34;
        
        if(grossSalary <= 1903.98)
            incomeTaxDiscount = 0;
        else if(grossSalary <= 2826.65)
            incomeTaxDiscount = 7.5;
        else if(grossSalary <= 3751.05)  
            incomeTaxDiscount = 15;
        else if(grossSalary <= 4664.68)
            incomeTaxDiscount = 22.5;
        else
            incomeTaxDiscount = 27.5;
        incomeTaxDiscount *= grossSalary / 100;

        double netSalary = grossSalary + lenghtOfServiceBonus + dccAid + xHoursBonus - overHoursDiscount - inssDiscount - incomeTaxDiscount;

        /* It's printing time! */
        System.out.println("Registration number: " + reg);
        System.out.println("Gross salary: $" + grossSalary);
        System.out.println("Lenght of service bonus: $" + lenghtOfServiceBonus);
        System.out.println("Day care center aid: $" + dccAid);
        System.out.println("Extra hours bonus: $" + xHoursBonus);
        System.out.println("Discount due to delays: $" + overHoursDiscount);
        System.out.println("INSS discount: $" + inssDiscount);
        System.out.println("Income tax discount: $" + incomeTaxDiscount);
        System.out.println("Net salary: $" + netSalary);
    }
}
