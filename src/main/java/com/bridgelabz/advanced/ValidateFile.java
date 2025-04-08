package com.bridgelabz.advanced;

import java.io.*;
import java.util.regex.*;

public class ValidateFile {
    public static void main(String[] args) {
        String file ="Employee.csv";
        try(BufferedReader br =new BufferedReader(new FileReader(file))){
            br.readLine();
            String line;
            while((line = br.readLine())!= null){
        String[] arr = line.split(",");
        validatePhoneNumber(arr);
        validateEmail(arr);

            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    public static void validatePhoneNumber(String[] arr) {
        if (!arr[3].matches("\\d{10}")) {
            System.out.println("ID: " + arr[0] + ", Name: " + arr[1] + ", Email: " + arr[2] + ", PH Number-: " + arr[3]);
            System.out.println("Error in Phone number of above employee");
        }
    }
        public static void validateEmail(String[] arr){
            if(!arr[2].matches("[a-zA-Z0-9=+_$?-]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}")){
                System.out.println("ID: "+arr[0] +", Name: "+ arr[1] + ", Email: "+arr[2]+", PH Number-: "+ arr[3]);
                System.out.println("Error in Email of above employee");
            }
    }
}
/*ID: 2, Name: B, Email: B, PH Number-: 1234567892
Error in Email of above employee
ID: 3, Name: C, Email: C@gmail.com, PH Number-: 123456789
Error in Phone number of above employee
 */