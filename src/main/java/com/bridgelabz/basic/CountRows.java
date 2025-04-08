package com.bridgelabz.basic;

import java.io.*;

public class CountRows {
    public static void main(String[] args) {
        String file ="output.csv";
        int count =0;
       try( BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                count++;
            }
        }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
        System.out.println(count-1);

    }
}
