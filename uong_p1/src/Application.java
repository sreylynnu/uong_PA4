// Contains a public class called Application
public class Application {
    //Contains a main method
    public static void main(String[] args) {
        //Create an instane of a DuplicateRemover called duplicateRemover
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        String inputFileName = "problem1.txt";
        String outputFileName = "unique_words.txt";

        duplicateRemover.remove(inputFileName);

        // Write method of duplicateRemover
        duplicateRemover.write(outputFileName);
    }
}
