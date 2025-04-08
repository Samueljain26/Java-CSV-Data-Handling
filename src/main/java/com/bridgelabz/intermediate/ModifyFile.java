package com.bridgelabz.intermediate;

import java.io.*;
import java.sql.SQLOutput;

public class ModifyFile {
    public static void main(String[] args) {
        String file ="output.csv";
        String file2 ="result.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file2))){
                br.readLine();
                String line;
                while((line = br.readLine())!= null){
                String[] arr = line.split(",");
                int salary = Integer.parseInt(arr[3]);
                salary += (salary*10)/100;
                String newLine = arr[0] +","+arr[1]+","+arr[2]+","+salary;
                writer.write(newLine);
                writer.newLine();
                }
                System.out.println("Done");
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
