public class Account{
    private int account;
    private String ownerName;
    private double balance;
    private double limit;


    Account(String name){
        this.ownerName = name;
    }

    Account(String name, double value){
        this.ownerName = name;
        this.balance = value;    
    }

    Account(){ this("Um trouxa qualquer"); }

    public boolean cashOut(double value){
        if(this.balance + this.limit >= value){
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean cashDeposit(double value){
        if(value >= 0){
            this.balance += value;
            return true;
        }
        return false;
    }

    public boolean cashTransf(Account destiny, double value){
        if(this.balance >= value){
            this.cashOut(value);
            destiny.cashDeposit(value);
            return true;
        }
        return false;
    }

    public double getBalance(){ return this.balance; }

    public void setBalance(double value){ this.balance = value; }

    public String getOwnerName(){ return this.ownerName; }
}
