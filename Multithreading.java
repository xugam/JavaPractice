class FirstThread extends Thread {
    public void run() {
                System.out.println("Thread 1 - Count: ");
        }
    }
    
class SecondThread extends Thread {
    public void run() {    
                System.out.println("Thread 2 - Count: ");
        }
    }

public class Multithreading {
    public static void main(String[] args) {
        // Create instances of the threads
        FirstThread thread1 = new FirstThread();
        SecondThread thread2 = new SecondThread();

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
