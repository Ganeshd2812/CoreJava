@FunctionalInterface
interface calc {
    public void Calc();
}
public class Assignment8Q1 {
    public static double addition(int num1, int num2) {
        return (num1+num2);
    }
    public static double subtraction(int num1, int num2){
        return (num1-num2);
    }
    public static double multiplication(int num1,int num2){
        return (num1*num2);
    }
    public static double division(int num1, int num2){
        return (num1/num2);
    }
    public static void main(String[] args) {
        int a = 20 ;
        int b = 10;
        calc cAdd  = () -> {
            System.out.println("Results of addition is :"+ addition(a,b));
            System.out.println("Results of subtraction is :"+ subtraction(a,b));
            System.out.println("Results of Multiplication is :"+ multiplication(a,b));
            System.out.println("Results of division is :"+ division(a,b));
        };
        cAdd.Calc();
    }
}
