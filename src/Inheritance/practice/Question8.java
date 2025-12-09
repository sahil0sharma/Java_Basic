package Inheritance.practice;
//Base class Bank:
//
//default constructor prints "Default Bank"
//
//parameterized constructor prints bankName
//
//Derived class Account:
//
//parameterized constructor calls super("SBI")
//
//Override showDetails()
//
//Ask:
//Write output of:
//new Account(1000);

class bank{
    String bankname;

    bank(){
        System.out.println("default bank");
    }

    bank(String bankname){
        this.bankname = bankname;
        System.out.println(bankname);
    }

    public void display(){
        System.out.println(bankname);
    }
}
class account extends bank{
    int amount;

    account(int amount){
        super("SBI");
        this.amount = amount;
        System.out.println(amount);
    }

    @Override
    public void display(){
        super.display();
    }
}
public class Question8 {
    public static void main(String[] args) {
        account a = new account(1000);

    }
}
