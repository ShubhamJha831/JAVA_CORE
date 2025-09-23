package Exception_and_file_handling.File_Handling;

import java.io.FileReader;
import java.io.IOException;

public class shubham_javafilereader {
    public static void main(String[] args) {
        String fileName = "java-cource.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int read;
            do {
                read = reader.read();   // read one character
                if (read != -1) {       // only print if not EOF
                    System.out.print((char) read);
                }
            } while (read != -1);       // continue until EOF
        } catch (IOException e) {
            System.out.printf("Exception occurred: %s", e.getMessage());
        }
    }
}
