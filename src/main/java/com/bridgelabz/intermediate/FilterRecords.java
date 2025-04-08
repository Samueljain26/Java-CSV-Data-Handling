package com.bridgelabz.intermediate;

import java.io.*;

public class FilterRecords {
    public static void main(String[] args) {
        String file = "src/main/java/com/bridgelabz/basic/Students.csv";
        try (BufferedReader br =new BufferedReader(new FileReader(file))){
            br.readLine();
            String line;
            while((line = br.readLine())!= null){
                String[] arr = line.split(",");
                int marks = Integer.parseInt(arr[3]);
                if(marks>80){
                    System.out.println("ID: "+ arr[0] + ", Name: "+arr[1] +", Age: "+arr[2] +", Marks: "+arr[3]);
                }

            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
