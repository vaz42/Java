public class Conta{
    int account;
    String ownerName;
    double balance;
    double limit;

    boolean cashOut(double value){
        if(this.balance + this.limite >= value){
            this.balance -= value;
            return true;
        }
        return false;
    }

    boolean cashDeposit()
}
