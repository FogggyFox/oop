package Accounts;

import Exceptions.MoneyException;

public class Debit {
    public int id;
    public double total;
    public double percent;
    private int totaltime=0;
    private double moneybox=0;
    public Debit(int id, double total, double percent){
        this.total=total;
        this.id=id;
        this.percent=percent;
    }
    public void Plus(double money) throws MoneyException {
        if (money<=0) throw new MoneyException("Money should be in positive value");
        else total+=money;
    }
    public void Minus(double money) throws MoneyException {
        if (money<=0) throw new MoneyException("Money should be in positive value");
        else total-=money;
    }
    public void Time(int time){
        for (int i=1; i<=time; i++){
            moneybox+=total* (percent/100);
            totaltime+=1;
            if (totaltime==30){
                total+=moneybox;
                totaltime=0;
                moneybox=0;
            }
        }
    }
}
