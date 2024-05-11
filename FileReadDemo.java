import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileReadDemo
{
    public static void main(String[] args) throws IOException
    {
        // Open the file.
        FileReader fr = new FileReader("myfile.txt");
        Scanner inFile = new Scanner(fr);

        // Read lines from the file till end of file
        while (inFile.hasNext())
        {
            // Read the next line.
            String line = inFile.nextLine();
            // Display the line.
            System.out.println(line);
        }

        // Close the file.
        inFile.close();
    }
}