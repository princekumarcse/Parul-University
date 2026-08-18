class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Interface: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Practical22{

    public static void main(String[] args) {

        // Creating thread using Thread class
        MyThread t1 = new MyThread();

        // Creating thread using Runnable interface
        MyRunnable obj = new MyRunnable();
        Thread t2 = new Thread(obj);

        // Starting both threads
        t1.start();
        t2.start();
    }
}