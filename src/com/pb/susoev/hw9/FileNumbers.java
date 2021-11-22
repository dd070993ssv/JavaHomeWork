package com.pb.susoev.hw9;

import java.io.FileWriter;
import java.io.Writer;
import java.security.SecureRandom;

public class FileNumbers {
    public static void main(String[] args)  {
        for (int i=0;i<100;i++){
            int q = (int) (Math.random() * 100);
            System.out.println(q);
     //   String data = "This is the data in the output file";

        // Creates a Writer using FileWriter
        try (Writer writer = new FileWriter("files/s02-writer.txt")) {

            // Writes string to the file
            writer.write(q);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }}
}
