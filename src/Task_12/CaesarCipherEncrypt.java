package Task_12;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CaesarCipherEncrypt {
    public static void encryptFile(String filePath, int shift) throws IOException {
        Path path = Paths.get(filePath);
        String content = new String(Files.readAllBytes(path));
        StringBuilder encrypted = new StringBuilder();

        for (char c : content.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + shift) % 26 + base);
            }
            encrypted.append(c);
        }

        Files.write(path, encrypted.toString().getBytes());
    }

    public static void main(String[] args) throws IOException {
        encryptFile("example.txt", 3);
    }
}