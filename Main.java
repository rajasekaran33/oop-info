class Wallet{
    int balance;

    void putMoney(int amount){
        this.balance += amount;
    }

    int getMoney(int amount){
        this.balance -= amount;
        return amount;
    }
    void showBalance(){
        System.out.println("balance="+this.balance);    
    }
}
class Main{
    public static void main(String[] args){
        Wallet wallet = new Wallet();
        wallet.putMoney(200);
        wallet.putMoney(100);
        wallet.showBalance();
        System.out.println(wallet.getMoney(50));
        wallet.showBalance();
        
    }
}