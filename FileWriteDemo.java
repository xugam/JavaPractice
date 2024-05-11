import java.io.PrintWriter; // Step 1
import java.io.IOException;
public class FileWriteDemo
{
    public static void main(String[] args) throws IOException
    {
        // Open the file.
        PrintWriter out = new PrintWriter("myfile.txt"); // Step 2
                                                            
        // Write the name of four oceans to  the file
        String s = "Hello this is a Test";
        out.println(s);
        // Close the file.
        out.close();  // Step 4
    }
}