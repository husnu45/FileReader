import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNumbersFromFile {

    public static void main(String[] args) {
        String filePath = "numbers.txt";
        int sum = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number;
            }
            bufferedReader.close();
            System.out.println("Sum of numbers read from the file: " + sum);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number in the file: " + e.getMessage());
        }
    }
}
