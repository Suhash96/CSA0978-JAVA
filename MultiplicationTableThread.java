 class MultiplicationTable implements Runnable {

    private int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MultiplicationTable(5));
        Thread thread2 = new Thread(new MultiplicationTable(10));

        // Thread States: New
        System.out.println("Thread 1 state: " + thread1.getState()); // New
        System.out.println("Thread 2 state: " + thread2.getState()); // New

        thread1.start();
        thread2.start();

        // Thread States: Runnable
        System.out.println("Thread 1 state: " + thread1.getState()); // Runnable
        System.out.println("Thread 2 state: " + thread2.getState()); // Runnable

        try {
            // Thread States: Blocked
            Thread.sleep(1000);
            System.out.println("Thread 1 state: " + thread1.getState()); // Blocked
            System.out.println("Thread 2 state: " + thread2.getState()); // Blocked

            // Thread States: Terminated
            thread1.join();
            thread2.join();
            System.out.println("Thread 1 state: " + thread1.getState()); // Terminated
            System.out.println("Thread 2 state: " + thread2.getState()); // Terminated
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
