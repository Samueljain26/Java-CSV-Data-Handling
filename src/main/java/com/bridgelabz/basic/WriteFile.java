package com.bridgelabz.basic;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String file ="output.csv";
        try(BufferedWriter writer =new BufferedWriter(new FileWriter(file))){
            writer.write("ID, Name, Department, Salary\n");
            writer.write("1,A,cse,1000\n");
            writer.write("2,B,cse,2000\n");
            writer.write("3,C,MBA,3000\n");
            writer.write("4,D,finance,5000\n");
            writer.write("5,A,accounts,7000\n");
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
