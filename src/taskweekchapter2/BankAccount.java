package taskweekchapter2;

public class BankAccount {
    double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }
    public Double getBalance(){
        return balance;
    }
    public Double addDeposit(double amount){
        balance += amount;
        return balance;
    }
    public boolean subDraw(double amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }else {
            return false;
        }
    }
    public void printBalance(){
        System.out.println("Ваш баланс: " + balance);
    }


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.0);

        System.out.println("Баланс: " + bankAccount.getBalance());

        double newBalance = bankAccount.addDeposit(50.0);
        System.out.println("Обновлённый баланс: " + newBalance);

        boolean success = bankAccount.subDraw(50.0);
        System.out.println("Снято: " + success);
        System.out.println("Баланс после снятия: " + bankAccount.getBalance());

        bankAccount.printBalance();

    }
}
