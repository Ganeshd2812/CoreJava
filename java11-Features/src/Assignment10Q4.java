import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Assignment10Q4 {
    public static void main(String[] args) throws IOException {
        var p = "src/studentlist.txt";
        String out = Files.readString(Path.of(p));
        List<String> lines = out.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip).toList();
        System.out.println("names : "+lines+" \ncount : "+lines.size());
    }
}