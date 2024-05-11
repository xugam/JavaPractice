class FirstThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 - Count: " + i);
                Thread.sleep(1000); // 1 second delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SecondThread extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 - Count: " + i);
                Thread.sleep(2000); // 2 seconds delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TwoThreadsExample {
    public static void main(String[] args) {
        // Create instances of the threads
        FirstThread thread1 = new FirstThread();
        SecondThread thread2 = new SecondThread();

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
