package com.bridgelabz.intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import java.io.IOException;

public class SortRecords {
    public static void main(String[] args) {
        String file = "NewFile.csv";

        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                records.add(arr);
            }

            // Sort by salary
            records.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

            System.out.println("Top 5 Highest Paid Employees:");

            for (int i = 0; i < 5; i++) {
                String[] r = records.get(i);
                System.out.println("ID: " + r[0] + ", Name: " + r[1] + ", Department: " + r[2] + ", Salary: " + r[3]);

            }

        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }
}
