package workingwithfileanddirectory.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyExample {

    public static void main(String[] args) {
        Path source = Paths.get("C:\\Users\\Engku Nazri\\Documents\\Workspace\\advance-java-programming\\src\\workingwithfileanddirectory\\creatingfile\\example.txt");
        Path destination = Paths.get("C:\\Users\\Engku Nazri\\Documents\\Workspace\\advance-java-programming\\src\\workingwithfileanddirectory\\copy\\examplecopy.txt");

        try {
            Files.copy(source, destination, REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
