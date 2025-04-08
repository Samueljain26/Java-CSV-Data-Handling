package com.bridgelabz.advanced;

import java.io.*;
import java.util.ArrayList;

class Student {
    int ID;
    String name;
    int mark;

    Student(int id, String name, int mark) {
        this.ID = id;
        this.name = name;
        this.mark = mark;
    }
}

public class ConvertCSVtoObject {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            ArrayList<Student> list = new ArrayList<>();
            String line;
            Student st;
            br.readLine();
            while((line = br.readLine()) != null) {
                String column[] = line.split(",");
                st = new Student(Integer.parseInt(column[0]),column[1],Integer.parseInt(column[2]));
                list.add(st);
            }

            for (int i=0;i<list.size();i++) {
                System.out.print("ID :" + list.get(i).ID);
                System.out.print(" Name :"+ list.get(i).name);
                System.out.println(" Mark :" + list.get(i).mark);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}