package taskweekchapter2.Chapter2Task10;

/**
 * Класс представляющий Аккаунт в банке
 */
public class BankAccount {
    public String accountNumber;
    public int balance;

    /**
     * Конструктор для создания банковского аккаунта
     * @param accountNumber номер аккаунта
     * @param balance  значение баланса
     */
    public BankAccount(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Возвращает номер аккаунта
     * @return номер аккаунта
     */

    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Устанавливает новый номер аккаунта
     * @param accountNumber новый номер аккаунта
     */

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Возвращает баланс
     * @return баланс
     */

    public int getBalance() {
        return balance;
    }

    /**
     * Устанавливает новое значение баланса
     * @param balance новое значение баланса
     */

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("555", 1000);
        System.out.println("Номер аккаунта: " + bankAccount.getAccountNumber() + ";" + " Баланс " + bankAccount.getBalance());
    }
}
