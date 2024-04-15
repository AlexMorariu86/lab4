package org.example;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = readLines("file.txt");
            Collections.sort(lines);
            String cuvant = "mere";
            cautaCuvant(lines, cuvant);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static List<String> readLines(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
    private static void cautaCuvant(List<String> lines, String cuvant) {
        boolean cuvantGasit = false;
        for (String line : lines) {
            if (line.contains(cuvant)) {
                cuvantGasit = true;
                System.out.println("cuvantul a fost gasit la linia ");
            }
            else {
                System.out.println("cuvantul nu a fost gasit");
            }
        }

    }
}