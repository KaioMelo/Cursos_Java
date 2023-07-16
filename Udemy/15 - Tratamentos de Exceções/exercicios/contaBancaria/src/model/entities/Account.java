package model.entities;

import model.exception.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException{
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Double deposit(Double amount){
        return balance += amount;
    }

    public Double withdraw(Double amount) throws DomainException{
        if(amount > withdrawLimit){
            throw new  DomainException("The amount exceeds withdraw limit");
        }
        if (amount > balance){
            throw new  DomainException("Not enough balance");
        }else{
            return balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "New balance: "
                + String.format("%.2f"+ getBalance());
    }
}
