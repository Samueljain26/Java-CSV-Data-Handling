package com.bridgelabz.advanced;

import java.util.*;
import java.io.*;

public class DeleteDuplicates {
    public static void main(String[] args) {
        String file = "Duplicates.csv";
        Set<String> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                String id = arr[0];

                if (!set.add(id)) {
                    System.out.println("ID: "+arr[0]+", Name: "+arr[1]+", Age: "+arr[2]+", Marks: "+arr[3]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
