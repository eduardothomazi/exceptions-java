package entities;

public class Account {
    private Integer number;
    private String name;
    private Double balance;
    private Double withdrawLimit;

    public Account(){
    }
    public Account(Integer number, String name, Double balance, Double withdrawLimit) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getBalance() {
        return balance;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
       if(amount>withdrawLimit){
           throw new IllegalArgumentException("Withdraw error: The amount exceeds withdraw limit");
       }
       if(amount>balance){
           throw new IllegalArgumentException("Withdraw error: Not enough balance");
       }
       if(amount<=withdrawLimit||amount<=withdrawLimit){
           balance -= amount;
       }
    }
    @Override
    public String toString() {
        return "New balance: " + String.format("%.2f", balance);
    }
}
