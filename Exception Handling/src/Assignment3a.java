public class Assignment3a {
    public static void main(String[] args) throws InsufficientBalanceException {

        double bal = 500 , withdraw = 600;

        try{

            if(bal<withdraw)
                throw new InsufficientBalanceException (withdraw-bal);

        }

        catch(InsufficientBalanceException e){
            System.out.println("NotenoughMoney");
        }

    }

    public static class InsufficientBalanceException extends Exception{
        double amount;
        InsufficientBalanceException(double amt){
            amount = amt;
        }
    }

}
