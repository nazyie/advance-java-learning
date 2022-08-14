package workingwithfileanddirectory.pathclass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

    public static void main(String[] args) {
        Path path = Paths.get("not-exist.txt");

        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.out.println("Error : {" + e);
        }

        Path path2 = Paths.get("C:\\Users\\Engku Nazri\\Documents\\Workspace\\advance-java-programming\\src\\workingwithfileanddirectory\\creatingfile\\example.txt");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
    }
}
