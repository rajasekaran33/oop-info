import java.util.ArrayList;
interface MoneyHolder{
    void putMoney(int amount);
    int getMoney(int amount);
}
class Wallet implements MoneyHolder{
    private int balance;
    public  void putMoney(int amount){
            if(amount>0){
                this.balance += amount;
            }
    }
    public int getMoney(int amount){
        if(amount<=this.balance){
            this.balance -= amount;
            return amount;
        }
        return 0;
    }
    public void showBalance(){
        System.out.println("balance="+this.balance);    
    }
}

class PhysicalWallet extends Wallet{
    ArrayList<Integer> pocket = new ArrayList<Integer>();

    public void putMoney(int amount){
        int noOfNotes = amount/100;
        for(int i=0;i<noOfNotes;i++){
            pocket.add(100);     
        }
        super.putMoney(amount);
    }

    public void showWallet(){
        for(Integer note:pocket){
            System.out.println(note);
        }
    }
}

class LockableWallet extends Wallet {
    private boolean lock;
    void open(){
        this.lock = false;
        System.out.println("Wallet unlocked");
    }
    void close(){
        this.lock = true;
        System.out.println("Wallet locked");
    }
}



class Main{
    public static void main(String[] args){
        // Wallet wallet = new Wallet();
        // wallet.putMoney(200);
        // wallet.putMoney(1000);
        // wallet.showBalance();
        // System.out.println(wallet.getMoney(400));
        // wallet.showBalance();

        // LockableWallet lockableWallet = new LockableWallet();
        // lockableWallet.open();
        // lockableWallet.putMoney(300);
        // lockableWallet.showBalance();
        // lockableWallet.getMoney(100);
        // lockableWallet.showBalance();
        // lockableWallet.close();

        // LockableWallet child = new LockableWallet();
        // Wallet parent = new Wallet();
        
        // Wallet x;
        // x= parent;
        // x = child;

        // PhysicalWallet physicalWallet = new PhysicalWallet();
        // physicalWallet.putMoney(600);
        // physicalWallet.showWallet();
        // physicalWallet.showBalance();

        MoneyHolder holder = new Wallet();
        holder.putMoney(1000);
        holder = new PhysicalWallet();

        holder.putMoney(2000);
        
    }
}