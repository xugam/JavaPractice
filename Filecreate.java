import java.io.IOException;
import java.io.File;

public class Filecreate {
    public static void main(String args[]){
        try{
        File obj1=new File("somu.txt");
            if(obj1.createNewFile())
            {
                System.out.println("file has been created: "+obj1.getName());
            }
            else{
              System.out.println("file exist already");  
            }
            }
            catch(IOException e){
                System.out.println("unsuccessfull"+e);
            }






    }
    


}