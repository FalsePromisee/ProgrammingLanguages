package Task_12;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReplaceSubstring {
    public static void replaceInFile(String filePath, String target, String replacement) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        content = content.replace(target, replacement);
        Files.write(Paths.get(filePath), content.getBytes(), StandardOpenOption.WRITE);
    }

    public static void main(String[] args) throws IOException {
        replaceInFile("example.txt", "oldText", "newText");
    }
}
