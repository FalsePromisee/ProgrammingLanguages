package Task_12;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BackupFileCopy {
    public static void copyToBackup(String filename) throws IOException {
        Path source = Paths.get(filename);
        Path destination = Paths.get(filename + ".bak");
        Files.copy(source, destination);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву файлу: ");
        String filename = scanner.nextLine();
        copyToBackup(filename);
    }
}