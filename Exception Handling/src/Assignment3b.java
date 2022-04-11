import java.util.*;
public class Assignment3b {
    public static void main(String[] args)  {

        double bal = 500 , withdraw = -500;


        try{

            if(withdraw < 0)
                throw new IllegalBankTransaction (withdraw-bal);

        }

        catch(IllegalBankTransaction e){
            System.out.println("Illegal Bank Transaction");
        }

    }

    public static class IllegalBankTransaction extends Exception{
        double amount;
        IllegalBankTransaction(double amt){
            amount = amt;
        }
    }

}
