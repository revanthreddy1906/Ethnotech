
import java .util.*;
class Customer {
    protected String name;
    protected int id;
    protected int amount;
    public Customer(String name, int id, int amount)
    {
        this.name=name;
        this.id=id;
        this.amount=amount;
    }
    void showsdetails()
    {
        System.out.println("Customer name: "+this.name);
        System.out.println("Customer id: "+this.id);
        System.out.println("Customer amount: "+this.amount);
    }
}
class Bankaccount extends Customer
{
    public Bankaccount(String name,int id,int amount)
    {
        super(name,id,amount);
    }
    void deposit(int depositamount)
    {
        amount+=depositamount;
        System.out.println("depositamount: "+depositamount);
    }
    void withdrawamount(int withdrawamount)
    {
        amount-=withdrawamount;
        System.out.println("withdrawamount: "+withdrawamount);
    }
    void checkbalance()
    {
        System.out.println("current balance: "+amount);
    }
}
class bankingSystem
{
    public static void main(String[] args)
    {
        Bankaccount customer1 = new Bankaccount("Revanth", 101, 5000);
        customer1.showsdetails();
        customer1.deposit(2000);
        customer1.checkbalance();
        customer1.withdrawamount(3000);
        customer1.checkbalance();
    }
}

