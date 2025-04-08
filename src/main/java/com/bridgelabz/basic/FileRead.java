package com.bridgelabz.basic;

import java.io.*;
import java.util.*;

public class FileRead {
    public static void main(String[] args) {

    String file = "src/main/java/com/bridgelabz/basic/Students.csv";

    try(
    BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] columns = line.split(",");
            System.out.println("ID: " + columns[0] + ", Name: " + columns[1] + ", Age: " + columns[2] + ", Marks: " + columns[3]);
        }
    }
    catch (IOException e)

    {
        System.out.println(e.getMessage());
    }
    }
    }
