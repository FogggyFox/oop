
import java.util.List;

public class BankManager {
    List<Bank> banks;

    public BankManager(){
        banks=null;
    }
    public void AddBank(String name, double debitpercent, double depositpercent, double creditcomission, double creditlimit, double checklim){
        banks.add(new Bank(banks.size()+1, name, debitpercent,  depositpercent,  creditcomission, creditlimit, checklim));
    }
    public void ViewBanks(){
        System.out.println("Banks:");
        for (Bank item : banks){
            System.out.println(item.id + "." + item.name);
        }
    }
    public void Time(int time){
        for (Bank item : banks){
            item.Time(time);
        }
    }
}
