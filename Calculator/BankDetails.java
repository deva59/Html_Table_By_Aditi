//Ek Bank hai Useme Paise Dale jate Hai or nikale Jate 

package Calculator;

public class BankDetails {
  static  int balance = 1000;
    
   static void deposit(int ammount){
        // balance = balance + ammount;
        if(ammount>0){
        balance=balance+ammount;
        }else{
            System.out.println("You can not deposit & Not Enter Less than Zero ");
        }
    }

   static void withdraw(int ammount){
        balance = balance - ammount;
    }

   static void display(){
        System.out.println("Current Balace: "+ balance);
    }
    public static void main(String[] args) {
        deposit(5);
        withdraw(0);
        display();
    }
}
