package Exception_and_file_handling.File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class shubham_javalearningwriter {


    public static void main(String[] args){

        String fileName = "java_course.txt";

        try( FileWriter writer = new FileWriter(fileName);){
            writer.write("This is the best program ever\n");
            for(int i = 0; i < 10000; i++){
                writer.write('*');
            }
            writer.flush();
            System.out.println("File Written successfully");
        } catch (IOException exception){
            System.out.printf("Exception occured %s\n", exception.getMessage());

        }
    }
}
