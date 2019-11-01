// Contains a public class called Application
public class Application {
    // Contains a main method
    public static void main(String[] args) {
        // Create an instance of DuplicateCounter called duplicateCounter
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        String inputFileName = "problem2.txt";
        String outputFileName = "unique_word_counts.txt";

        duplicateCounter.count(inputFileName);

        //Write method of duplicateCounter
        duplicateCounter.write(outputFileName);
    }
}
