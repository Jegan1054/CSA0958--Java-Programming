import java.util.Scanner;
class MyThread extends Thread {
    private String threadName;
    private int count;
    MyThread(String name, int count) {
        threadName = name;
        this.count = count;
    }
    public void run() {
        System.out.println(threadName + " started.");
        for (int i = 1; i <= count; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the first thread: ");
        String thread1Name = scanner.nextLine();
        System.out.print("Enter the count for the first thread: ");
        int thread1Count = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the name of the second thread: ");
        String thread2Name = scanner.nextLine();
        System.out.print("Enter the count for the second thread: ");
        int thread2Count = scanner.nextInt();
        MyThread thread1 = new MyThread(thread1Name, thread1Count);
        MyThread thread2 = new MyThread(thread2Name, thread2Count);
        thread1.start();
        try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted during join.");
        }
        System.out.println("Main thread finished.");
    }
}