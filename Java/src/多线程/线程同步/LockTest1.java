public class LockTest1 {
    static final Object LOCK_A = new Object();
    static final Object LOCK_B = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    static void sleep1s() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread-1: try get lock A...");
        synchronized (LockTest1.LOCK_A) {
            System.out.println("Thread-1: lock A got.");
            LockTest1.sleep1s();
            System.out.println("Thread-1: try get lock B...");
            synchronized (LockTest1.LOCK_B) {
                System.out.println("Thread-1: lock B got.");
                LockTest1.sleep1s();
            }
            System.out.println("Thread-1: lock B released.");
        }
        System.out.println("Thread-1: lock A released.");
    }
}

class Thread2 extends Thread {

    public void run() {
        System.out.println("Thread-2: try get lock B...");
        synchronized (LockTest1.LOCK_B) {
            System.out.println("Thread-2: lock B got.");
            LockTest1.sleep1s();
            System.out.println("Thread-2: try get lock A...");
            synchronized (LockTest1.LOCK_A) {
                System.out.println("Thread-2: lock A got.");
                LockTest1.sleep1s();
            }
            System.out.println("Thread-2: lock A released.");
        }
        System.out.println("Thread-2: lock B released.");
    }
}
//如何避免死锁呢？答案是：线程获取锁的顺序要一致。即严格按照先获取lockA，再获取lockB的顺序