abstract class Bank{
    void openAccount(){//concrete method i.e;implemented method
        System.out.println("Account is open");//package private scope
    }
    abstract void deposit(float amt);//abstract or non-impemented method
}
class CityBank extends Bank{//concrete class: it a class that can be instantiated
    public void deposit(float amt){
        System.out.println("Deposited");
    }
}
public class AbstractDemo2 {
    public static void main(String[] args) {
        Bank b=new CityBank();
        b.openAccount();
        b.deposit(1000.00f);
    }
}
