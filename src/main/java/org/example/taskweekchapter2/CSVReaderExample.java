package org.example.taskweekchapter2;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class CSVReaderExample {
    public static void main(String[] args) throws Exception {
     try (CSVReader csvReader = new CSVReader( new FileReader("data.csv"))){
         String[] nextLine;
         while ((nextLine = csvReader.readNext()) != null){
             for (String cell : nextLine){
                 System.out.print(cell +"\t");
             }
             System.out.println();
         }


     } catch (Exception e){
         e.printStackTrace();
     }
    }
}
