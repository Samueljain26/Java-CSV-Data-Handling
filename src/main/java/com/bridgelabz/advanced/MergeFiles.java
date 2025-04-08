package com.bridgelabz.advanced;

import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import com.opencsv.CSVReader;
import java.io.*;
import java.util.Map;
import java.util.*;

public class MergeFiles {
    public static void main(String[] args) {


        String file1 = "Student1.csv";
        String file2 = "Student2.csv";
        String file3 ="MergeStudents.csv";

        try {
        CSVReader reader1 = new CSVReader(new FileReader(file1));
            Map<String,String[]> map =new HashMap<>();
            String[] line1;
            reader1.readNext();
            while((line1 = reader1.readNext())!= null){
            map.put(line1[0],new String[]{line1[1],line1[2]});
            }
            CSVReader reader2 =new CSVReader(new FileReader(file2));
            String[] line2;
            reader2.readNext();

            CSVWriter writer =new CSVWriter(new FileWriter(file3));
            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});
            while ((line2 = reader2.readNext()) != null) {
                String id = line2[0];
                if (map.containsKey(id)) {
                    String[] studentInfo = map.get(id);
                    writer.writeNext(new String[]{id, studentInfo[0], studentInfo[1], line2[1], line2[2]});
                }
            }
            System.out.println("done");

            } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}