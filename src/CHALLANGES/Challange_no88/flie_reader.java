package CHALLANGES.Challange_no88;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class flie_reader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the file name which you want us to read");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.print((char)read);
            }

        }catch (IOException exception){
            System.out.printf("Exception occured: %s", exception.getMessage());
        }
    }
}
