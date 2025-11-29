package user;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class File_reader {

    public static List<String> csv_reader() {
    	
        List<String> user = new ArrayList<>();
        String path = "csv_file.csv";

        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] cells;

            while ((cells = reader.readNext()) != null) {
                for (String value : cells) {
                    System.out.print(value + "|");  // print each cell
                    user.add(value);                // add each cell to the list
                }
                System.out.println();
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        return user;  // return the list
    }

//    public static void main(String[] args) {
//        List<String> data = csv_reader();
//        System.out.println("Collected values: " + data);
//    }

}