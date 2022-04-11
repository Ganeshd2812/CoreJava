import java.util.Objects;

class SingletonInheritanceCheck{
    public static void Check(Assignment2Q1 x, Assignment2Q1 y) {
        if(Objects.equals(x, y)){
            System.out.println("Singleton Inheritance check complete and authenticated");}

        else {
            System.out.println("this is not a singleton class");
        }
    }
}
class Assignment2Q1
{
    private static Assignment2Q1 instance;
    public String str;
    private Assignment2Q1()
    {
        str = "This is a singleton class";
    }
    public static Assignment2Q1 getInstance()
    {
        if (instance == null)
        {
            instance = new Assignment2Q1();
        }
        return instance;
    }
    public static void main(String args[])
    {
        Assignment2Q1 text = Assignment2Q1.getInstance();
        Assignment2Q1 text2 = Assignment2Q1.getInstance();
        System.out.println(text.str);
        System.out.println(text2.str);
        SingletonInheritanceCheck.Check(text,text2);
    }
}
