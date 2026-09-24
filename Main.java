class Wallet{
    int balance;

    void putMoney(int amount){
        if(amount>0){
            this.balance += amount;
        }
    }

    int getMoney(int amount){
        if(amount<=this.balance){
            this.balance -= amount;
            return amount;
        }
        return 0;
    }
    void showBalance(){
        System.out.println("balance="+this.balance);    
    }
}
class Main{
    public static void main(String[] args){
        Wallet wallet = new Wallet();
        wallet.putMoney(200);
        wallet.putMoney(-100);
        wallet.showBalance();
        System.out.println(wallet.getMoney(400));
        wallet.showBalance();
        
    }
}