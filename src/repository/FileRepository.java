package repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRepository {

    public StringBuilder readFile(String fileName) {
        StringBuilder encryptedText = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("./src/resources/" + fileName))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                sCurrentLine = sCurrentLine.toLowerCase();
                encryptedText.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return encryptedText;
    }
}
