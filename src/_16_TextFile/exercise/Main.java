package _16_TextFile.exercise;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String pathOriginal = "C0421G1_DONGVANNHAT_MODULE22\\src\\_16_TextFile\\Data\\Original.txt";
        String pathClone = "C0421G1_DONGVANNHAT_MODULE22\\src\\_16_TextFile\\Data\\clone.txt";
        File original;
        File cloneOriginal;
        try {
            original = new File(pathOriginal);
            if (!original.exists()){
                original.createNewFile();
            }
            cloneOriginal = new File(pathClone);
            if (!cloneOriginal.exists()){
                cloneOriginal.createNewFile();
            }
            CopyFileText.copyFile(original, cloneOriginal);
            System.out.println("Successful!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
