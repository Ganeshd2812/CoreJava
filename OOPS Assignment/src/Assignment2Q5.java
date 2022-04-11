abstract class Shape5 {
    abstract public String draw();
}

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return "Rectangle drawn : []";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
        return "line drawn : ------";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return "Cube drawn : cube";
    }
}

public class Assignment2Q5{
    public static void main(String[] args)  {
        Rectangle5 R1 = new Rectangle5 ();
        Line5 L1 = new Line5 ();
        Cube5 C1 = new Cube5 ();
        System.out.println(R1.draw());
        System.out.println(L1.draw());
        System.out.println(C1.draw());
    }
}
