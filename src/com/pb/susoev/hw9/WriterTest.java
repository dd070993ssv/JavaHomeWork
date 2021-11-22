package com.pb.susoev.hw9;

import java.io.FileWriter;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) {
        String data = "This is the data in the output file";

        // Creates a Writer using FileWriter
        try (Writer writer = new FileWriter("files/s02-writer.txt")) {

            // Writes string to the file
            writer.write(data);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
