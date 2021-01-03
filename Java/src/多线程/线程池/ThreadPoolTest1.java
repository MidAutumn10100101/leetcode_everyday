import java.util.concurrent.*;

public class ThreadPoolTest1 {
    public static void main(String[] args){

        //线程数固定的线程池；
//        ExecutorService es = Executors.newFixedThreadPool(4);
        //线程数根据任务动态调整的线程池；
        //ExecutorService es = Executors.newCachedThreadPool();
        //创建指定动态范围的线程池
        int min = 4;
        int max = 5;
        LinkedBlockingQueue<Runnable> q = new LinkedBlockingQueue<>(1);
        ExecutorService es = new ThreadPoolExecutor(min, max, 60L, TimeUnit.SECONDS, q);

        for (int i=0; i<8; i++){
            try {
                es.submit(new TaskTest(""+i));
            }
            catch(RejectedExecutionException e){
                System.out.println("Task "+i+" was rejected.");
            }
        }

        es.shutdown();
    }

}

class TaskTest implements Runnable{

    private final String name;

    TaskTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task" + name);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        System.out.println("end task" + name);
    }
}
