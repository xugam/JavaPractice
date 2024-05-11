import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
class Somu{
    public static void main(String args[])
    {
       try{
          FileWriter wr= new FileWriter("somu1.txt");
           Scanner obj =new Scanner(System.in);
           String str= obj.nextLine();
           System.out.println("write about ur bestfriend");
           wr.write(str);
           wr.close();
           obj.close();
           
        }
        catch(IOException e){
            System.out.println("an error has occured");
            e.printStackTrace();
        }
        try{
            FileReader myobj= new FileReader("somu1.txt");
           Scanner myReader = new Scanner(myobj);
           while (myReader.hasNext()) {
             //String data = myReader.nextLine();
             System.out.println(myReader);
           }
           
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}