package Task_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CaesarCipherDecrypt {
    public static void decryptFile(String filePath, int shift) throws IOException {
        Path path = Paths.get(filePath);
        String content = new String(Files.readAllBytes(path));
        StringBuilder decrypted = new StringBuilder();

        for (char c : content.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base - shift + 26) % 26 + base);
            }
            decrypted.append(c);
        }

        Files.write(path, decrypted.toString().getBytes());
    }

    public static void main(String[] args) throws IOException {
        decryptFile("example.txt", 3);
    }
}