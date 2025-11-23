// instance method
class ConsoleColors {
    // Reset
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
}
class BankAccount{
    double balance=1000;
    void deposit(int amount){
        
        balance+=amount;
        showBalance();
    }
    void withdraw(int amount){
         if (balance<amount){
            System.out.println(ConsoleColors.RED+"insufficient balance." + " Transaction failed!!"+ConsoleColors.RESET);}
        else{
            System.out.println("withdrawal successful");
                 balance-=amount;
        }
   
        showBalance();
    }
    void showBalance(){
        
        System.out.println("your balance is:"+balance);
    }
    public static void main(String[] args) 
    
    {
        BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount();
        BankAccount acc3=new BankAccount();
        System.out.println(ConsoleColors.YELLOW + "user 1 transactions: "+ConsoleColors.RESET);
        acc1.deposit(5000);
        acc1.withdraw(1000);
        System.out.println(ConsoleColors.GREEN+"user 2 transactions: "+ConsoleColors.RESET);
        acc2.deposit(100);
        acc2.withdraw(2500);
        System.out.println(ConsoleColors.BLUE+"user 3 transactions: "+ConsoleColors.RESET);
        acc3.deposit(1200);
        acc3.withdraw(600);
       
    }
}