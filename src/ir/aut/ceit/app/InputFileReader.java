package ir.aut.ceit.app;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputFileReader {
    /**
     * The method reads a text file ,so it returns the result to string.
     *
     * @param filePath
     * @return
     * @throws IOException
     */
    public static String readTextFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        final String lineSeparator = System.lineSeparator();
        try {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(lineSeparator);
            }
        } finally {
            br.close();
        }
        return sb.toString();
    }
}
