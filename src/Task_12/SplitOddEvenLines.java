package Task_12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SplitOddEvenLines {
    public static void splitLines(String filePath) throws IOException {
        List<String> oddLines = new ArrayList<>();
        List<String> evenLines = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (lineNumber % 2 == 0) {
                    evenLines.add(line);
                } else {
                    oddLines.add(line);
                }
                lineNumber++;
            }
        }

        Files.write(Paths.get("oddLines.txt"), oddLines);
        Files.write(Paths.get("evenLines.txt"), evenLines);
    }

    public static void main(String[] args) throws IOException {
        splitLines("example.txt");
    }
}