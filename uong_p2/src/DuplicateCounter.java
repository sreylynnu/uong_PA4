import java.io.*;
import java.util.HashMap;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

// Contains a public class called DuplicateCounter
public class DuplicateCounter {
    HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    // Contains a method called count
    public void count(String inputFileName) {
        //Determines the number of occurrences of each word
        try{
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while(line != null) {
                if(wordCounter.get(line) != null) {
                    wordCounter.put(line, wordCounter.get(line) + 1);
                }
                else {
                    wordCounter.put(line, 1);
                }
                line = bufferedReader.readLine();
            }
            // Cleans up any and all resources allocated.
            bufferedReader.close();
        }
        // Alerts users when an exception IO event occurs
        catch(FileNotFoundException excpt) {
            System.out.println("Caught FileNotFoundException: The file could not be found.");
        }
        catch(IOException excpt) {
            System.out.println("Caught IOException: The file could not be read.");
        }
    }

    public void write(String outputFileName) {
        try {
            FileWriter fileWriter = new FileWriter(outputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Prints the current collection of unique words and their counts to outputFile
            bufferedWriter.write(wordCounter.toString());

            // Cleans up any and all resources allocated
            bufferedWriter.close();
        }
        // Alerts users when an exceptional IO event occurs
        catch(IOException excpt) {
            System.out.println("Caught IOException: The file could not be written.");
        }
    }
}
