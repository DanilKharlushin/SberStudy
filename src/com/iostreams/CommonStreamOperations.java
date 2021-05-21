package com.iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CommonStreamOperations {

    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        try(FileReader reader = new FileReader(file)) {
            reader.skip(2);
            for (int i = 0; i < 4; i++) {
                System.out.println((char) reader.read());
            }
        }

        try(FileWriter writer = new FileWriter("New file.txt")) {
            String str = "Люблю Java";
            writer.write(str);
        }
    }
}
