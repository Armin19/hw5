package ir.aut.ceit.app;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * It makes a file where the filePath points and writes the content.
 */
public class OutputFileWriter {

    public static void writeTextFile(String filePath, String content) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        try {
            bw.write(content);
        } finally {
            bw.close();
        }
    }
}
