public class Bank
{
    private int balance;   
    public Bank()
    {balance = 0;}
    public void deposit(int amount)
    { balance = balance + amount;}
    
    public void withdraw(int amount)
    { balance = balance-amount;}
    
    public int showBalance()
    {return balance;}
}