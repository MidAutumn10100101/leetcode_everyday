public class ThreadTest2 {
    public static void main(String[] args) throws Exception {
        AddThread2 add = new AddThread2();
        DecThread2 dec = new DecThread2();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter2.count);
    }
}

class Counter2 {
    public static final Object lock = new Object();
    public static int count = 0;
}

class AddThread2 extends Thread {
    public void run() {
        for (int i=0; i<100; i++) {
            synchronized (Counter2.lock){
                Counter1.count += 1;
            }
        }
    }
}

class DecThread2 extends Thread {
    public void run() {
        for (int i=0; i<100; i++) {
            synchronized (Counter2.lock){
                Counter1.count -= 1;
            }
        }
    }
}
