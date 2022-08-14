package io.trywithresource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Try with resource no need to care about the manage the resource
 * Help to avoid the resource leaks
 */
public class TryWithResourceExample {

    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
                StringWriter writer = new StringWriter();
        ) {
            writer.write(reader.readLine());
            System.out.println(writer);
        } catch (IOException e) {

        }
    }
}
