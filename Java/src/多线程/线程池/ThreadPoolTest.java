import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args){
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            pool.submit(() -> {
                System.out.println("aoligei " + Math.random());
            });
        }
        for (int i = 0; i < 20; i++) {
            pool.submit(() -> {
                System.out.println("wxl666 " + Math.random());
            });
        }
    }

}
