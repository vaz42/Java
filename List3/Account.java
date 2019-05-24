public class Account{
    int account;
    String ownerName;
    double balance;
    double limit;

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

    public boolean cashTransf(Conta destiny, double value){
        if(this.balance >= value){
            this.cashOut(value);
            destiny.cashDeposit(value);
            return true;
        }
        return false;
    }
}
