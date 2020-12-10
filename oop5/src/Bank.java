import java.util.ArrayList;
import java.util.List;

public class Bank {
    public int id;
    public String name;
    public double debitpercent;
    public double depositpercent;
    public double creditcomission;
    public double creditlimit;
    public double checklim;
    List<Client> clients = new ArrayList<>();

    public Bank(int id, String name, double debitpercent, double depositpercent, double creditcomission, double creditlimit, double checklim){
        this.id=id;
        this.name=name;
        this.debitpercent=debitpercent;
        this.depositpercent=depositpercent;
        this.creditcomission=creditcomission;
        this.creditlimit=creditlimit;
        this.checklim= checklim;
    }
    public void addClient(String name, String surname){
        clients.add(new Client(clients.size()+1,name,surname, checklim));
    }
    public void viewClients(){
        System.out.println("Clients");
        for (Client item : clients){
            System.out.println(item.id+ "."+ item.surname + " " + item.name);
        }
    }
    public void addDepositToClient(int id, double money, int time){
        clients.get(id).AddDeposit(money, time, depositpercent);
    }
    public void addDebitToClient(int id, double money){
        clients.get(id).AddDebit(money, debitpercent);
    }
    public void addCreditToClient(int id, double money){
        clients.get(id).AddCredit(money, creditcomission, creditlimit);
    }
    public void Time(int time){
        for (Client item : clients){
            item.Time(time);
        }
    }

}
