public class Employee{
    //Vaz & Luciano & Calbo
    private int registration;
    private String employeeName;
    private double baseSalary;
    private int dependents;
    private int lenghtOfService;
    private double lenghtOfServiceBonus = lenghtOfService * grossSalarprivate  * 2 / 100.0;
    private int dependentsAid = dependents * 21;

    
    double inssDiscount;
    double incomeTaxDiscount;

    if(baseSalary <= 1751.81)
        inssDiscount = 8;
    else if(grossSalary <= 2919.72)
        inssDiscount = 9;
    else    
        inssDiscount = 11;
        inssDiscount *= grossSalary / 100;
    if(inssDiscount >= 642.34)
        inssDiscount = 642.34;
        
    if(grossSalary <= 1800)
        incomeTaxDiscount = 0;
    else if(grossSalary <= 2900)
        incomeTaxDiscount = 15;
    else
        incomeTaxDiscount = 27.5;
    incomeTaxDiscount *= baseSalary / 100;
}