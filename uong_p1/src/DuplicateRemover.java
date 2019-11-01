import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

// Contains a public class called DuplicateRemover
public class DuplicateRemover {
    ArrayList<String> listOfWords = new ArrayList<String>();

    // DuplicateRemover contains a method called remove
    public void remove(String inputFileName) {
        try {
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while(line != null) {
                listOfWords.add(line);
                line = bufferedReader.readLine();
            }
            // Cleans up any and all resources allocated
            bufferedReader.close();
        }
        // Alerts user when an exceptional IO event occurs
        catch(FileNotFoundException excpt) {
            System.out.println("Caught FileNotFoundException: The file could not be found.");
        }
        catch(IOException excpt) {
            System.out.println("Caught IOException: The file could not be read.");
        }
    }

    // DuplicateRemover contains a method called write
    public void write(String outputFileName) {
        try {
            FileWriter fileWriter = new FileWriter(outputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            HashSet<String> uniqueWords = new HashSet<String>(listOfWords);

            //Prints the current collection of unique words to outputFile
            bufferedWriter.write(uniqueWords.toString());

            // Cleans up any and all resources allocated
            bufferedWriter.close();
        }
        // Alerts user when an exceptional IO event occurs
        catch(IOException excpt) {
            System.out.println("Caught IOException: The file could not be written.");
        }
    }
}
