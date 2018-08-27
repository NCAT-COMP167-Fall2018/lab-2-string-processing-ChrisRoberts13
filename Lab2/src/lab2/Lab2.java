/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author cbrobert
 */
public class Lab2 {
static String [] records;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename;
        String Firstname;
        String Lastname;
        String Gender;
        String Age;
        String PhoneNumber;
        String EmailAddress;
        System.out.println(records);
  //Actions to perform if there is an exception
}
       // TODO code application logic here
    
    public static void readData (String filename){
     records = new String[100];
        try {
 java.util.Scanner scanner = new java.util.Scanner (new File(String filename[0]));
 int currentIndex = 0;
while(scanner.hasNext()){
    String[] line = scanner.nextLine().split(",");
String Firstname = line[0];
                String Lastname = line[1]; 
                String Gender = line[2];
                String Age = line[3];
                String PhoneNumber = line[4];
                String EmailAddress = line[5];
                records[currentIndex] = String.format("String Firstname;\n" +
"                String Lastname; \n" +
"                String Gender;\n" +
"                String Age;\n" +
"                String PhoneNumber;\n" +
"                String EmailAddress;");
currentIndex++;//perform some operation that could cause an exception
}
}catch (FileNotFoundException ex) {
        System.err.println("Failed to read input file");
        }   
    }
    
}
