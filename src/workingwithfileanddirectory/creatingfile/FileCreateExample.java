package workingwithfileanddirectory.creatingfile;

import java.io.File;
import java.io.IOException;

public class FileCreateExample {

    public static void main(String[] args) {

        File myfile = new File("C:\\Users\\Engku Nazri\\Documents\\Workspace\\advance-java-programming\\src\\workingwithfileanddirectory\\creatingfile\\example.txt");

        try {
            boolean isFileCreated = myfile.createNewFile();

            System.out.println(isFileCreated);
        } catch (IOException e) {
            System.out.println("Error {" + e);
        }
    }
}
