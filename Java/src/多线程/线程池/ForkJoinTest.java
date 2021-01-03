import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTest {
    public static void main(String[] args) throws Exception{
        long[] array = new long[4000000];
        long expectedSum = 0;
        long startTime1 = System.currentTimeMillis();
        for(int i=0; i<array.length; i++){
            array[i] = random();
            expectedSum += array[i];
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Expected sum: " + expectedSum + " in " + (endTime1 - startTime1) + " ms.");
        //采用ForkJoin
        ForkJoinTask<Long> task = new SumTask(array, 0, array.length);
        long startTime2 = System.currentTimeMillis();
        Long result = ForkJoinPool.commonPool().invoke(task);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Fork/join sum: " + result + " in " + (endTime2 - startTime2) + " ms.");
    }

    static Random random = new Random(0);

    static long random(){
        return random.nextInt(10000);
    }
}


class SumTask extends RecursiveTask<Long>{

    static final int THRESHOLD = 500;
    long[] array;
    int start;
    int end;

    SumTask(long[] array,int start,int end){
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if(end-start <= THRESHOLD){
            //任务量小直接算
            long sum = 0;
            for(int i=start; i<end; i++){
                sum += this.array[i];
                // 故意放慢计算速度:
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                }
            }
            return sum;
        }
        //任务太大 一分为二
        int middle = (end + start) / 2;
        System.out.println(String.format("split %d~%d ==> %d~%d, %d~%d", start, end, start, middle, middle, end));
        SumTask subtask1 = new SumTask(this.array, start, middle);
        SumTask subtask2 = new SumTask(this.array,middle,end);
        invokeAll(subtask1,subtask2);
        Long subresult1 = subtask1.join();
        Long subresult2 = subtask2.join();
        Long result = subresult1 + subresult2;
        System.out.println("result = " + subresult1 + " + " + subresult2 + " ==> " + result);
        return result;
    }
}