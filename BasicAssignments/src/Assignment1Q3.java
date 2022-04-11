import java.util.Scanner;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){

        double si = (principalAmount*time*interestRate)/100;

        return  si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){

        double ci = (principalAmount * (Math.pow((1+interestRate),time)) ) - principalAmount;

        return ci;
    }
}


public class Assignment1Q3 {

    public static void main(String[] args) {

        SiCi siCi = new SiCi();
        double principalAmounnt,interestRate;
        int time;
        System.out.println("Enter the principal Amount: ");
        Scanner scanner = new Scanner(System.in);
        principalAmounnt = scanner.nextDouble();
        System.out.println("Enter the Annual interest rate: ");
        interestRate = scanner.nextDouble();
        System.out.println("Enter the period of time: ");
        time = scanner.nextInt();


        System.out.println("The simple interest for the principal Amount "+principalAmounnt+" for "+time+" years: "+siCi.simpleInterest(principalAmounnt,time,interestRate));

        System.out.println("The compound interest for the principal Amount "+principalAmounnt+" for "+time+" years: "+siCi.compoundInterest(principalAmounnt,time,interestRate));

    }

}