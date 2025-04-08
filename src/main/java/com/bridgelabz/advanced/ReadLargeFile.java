package com.bridgelabz.advanced;

import java.io.*;
import java.util.*;

public class ReadLargeFile {
    public static void main(String[] args) {
        String filePath = "largefile.csv";
        int batchSize = 100;
        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<String[]> batch = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                batch.add(arr);

                if (batch.size() == batchSize) {
                    totalRecords += batch.size();
                    System.out.println("Processed " + totalRecords + " records");

                    // Clear the batch for next set
                    batch.clear();
                }
            }

            if (!batch.isEmpty()) {
                totalRecords += batch.size();
                System.out.println("Processed " + totalRecords + " records");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
