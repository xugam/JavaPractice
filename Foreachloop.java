
public class Foreachloop extends Thread {
    public void odd(){
        try 
                {
        for(int i=10;i<=20;i++){
            int flag=0;
            flag=i%2;
            
            if(flag!=0){
                System.out.println(i);
              
                    Thread.sleep(2000);
                } 
                
            }
        }
        catch(InterruptedException e){}
    }
    public void even(){
        try 
                {
        for(int i=1;i<=10;i++){
            int flag=0;
            flag=i%2;
            
            if(flag==0){
                System.out.println(i);
                
                    Thread.sleep(2000);
                } 
               
            }
            }
            catch(InterruptedException e){}
        }
    
    public static void main(String[] args) {
            Foreachloop f1 = new Foreachloop();
            f1.start();
        }
    }

