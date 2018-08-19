package com.academy.lesson16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class ExcDemo {
    public static void main(String[] args) {
        readNamesDemo();
    }

    private static void readNamesDemo() {
        String path = "e:/Java-part-maven/Data/женские имена.txt";
        String pathSorted = "e:/Java-part-maven/Data/женские имена на И.txt";
        try ( OutputStream os = new FileOutputStream(pathSorted);
                OutputStreamWriter osw = new OutputStreamWriter(os);)
        {
            Files.lines(Paths.get(path))
                    .filter(s->s.startsWith("И"))
                    .sorted((s1,s2)->s2.compareTo(s1))
                    .peek((s -> {
                        try {
                            osw.write(s);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
