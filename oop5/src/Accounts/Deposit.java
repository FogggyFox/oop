package Accounts;

import Exceptions.MoneyException;
import Exceptions.TimeDepositException;

public class Deposit {
    public int id;
    public double total;
    public int time;
    private int totaltime=0;
    private double moneybox=0;
    public double percent;

    public Deposit(int id, double total, int time, double percent){
        this.id=id;
        this.total=total;
        this.time=time;
        this.percent=percent;
    }
    public void Plus(double money) throws TimeDepositException, MoneyException {
        if (money<=0) throw new MoneyException("Money should be in positive value");
        else if (time<=0) throw new TimeDepositException("Time of deposit ended.");
        else total+=money;
    }
    public void Minus(double money) throws TimeDepositException, MoneyException {
        if (money<=0) throw new MoneyException("Money should be in positive value");
        if (time>0) throw new TimeDepositException("Time of deposit is not ended. You can't add money on this acc");
        else total-=money;
    }
    public void Time(int time){
        for (int i=1; i<=time; i++){
            this.time-=1;
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

