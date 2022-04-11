import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
    int AuthorID();
    String Author() ;
    String Supervisor() ;
    String Date();
    String Time();
    float Version();
    String Description();
}
@info(AuthorID=110,Date="11-03-2022",Time="19:40",Version=221, Author = "ganesh", Description = "java", Supervisor = "Saravanan")

class developer{
    int AuthorID;
    String Author ;
    String Supervisor ;
    String Date;
    String Time;
    float Version;
    String Description;
    public developer(int AuthorID, String Date, String Time, float Version) {
        this.AuthorID = AuthorID;
        this.Date = Date;
        this.Time = Time;
        this.Version = Version;
    }

}
public class Assignment7Q2  {
    public static void main(String[] args) {
        developer ganesh= new developer(20,"21-02-2022","2.30",20);

        Class a = ganesh.getClass();
        java.lang.annotation.Annotation p = a.getAnnotation(info.class);
        info i = (info)p;
        System.out.println(i);

    }
}
