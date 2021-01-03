public class ThreasTest1 {
    public static void main(String[] args) throws Exception {
        AddThread1 add = new AddThread1();
        DecThread1 dec = new DecThread1();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter1.count);
    }
    
}
class Counter1 {
    public static int count = 0;
}

class AddThread1 extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) { Counter1.count += 1; }
    }
}

class DecThread1 extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) { Counter1.count -= 1; }
    }
}

