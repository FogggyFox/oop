package Accounts;

import Exceptions.MoneyException;

public class Credit {
    public int id;
    public double total;
    public double commission;
    public double limit;

    public Credit(int id, double total,double commission, double limit){
        this.total=total;
        this.id=id;
        this.commission=commission;
        this.limit=limit;
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
            if (total<0 && total > limit){
                total-=commission;
            }
        }
    }
}
