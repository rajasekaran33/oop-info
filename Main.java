class Wallet{
    int balance;

    void showBalance(){
        System.out.println("balance="+this.balance);    
    }
}
class Main{
    public static void main(String[] args){
        Wallet wallet = new Wallet();
        wallet.balance = 100;
        wallet.showBalance();
        
    }
}