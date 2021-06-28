package _16_TextFile.exercise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText {
    public static void copyFile(File original, File clone) throws IOException {
        FileReader fileReader = new FileReader(original);
        FileWriter fileWriter = new FileWriter(clone);
        int count;
        while ((count = fileReader.read()) != -1) {
            fileWriter.write(count);
        }
        fileWriter.close();
        fileReader.close();
    }
}
