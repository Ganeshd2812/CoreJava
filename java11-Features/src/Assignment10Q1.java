public class Assignment10Q1{
    @FunctionalInterface
    public interface SimpleInterest{
        public void simple(int P,int R,int T);

    }

    public static void main(String[] args) {
        SimpleInterest si=(var P,var R,var T)-> System.out.println(P*R*T/100);
        si.simple(5000,4,2);

    }
}