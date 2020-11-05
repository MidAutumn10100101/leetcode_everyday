import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MultiThread {
    public static void main (String[] args){
        int[] array = new int[5];
        int[] arr = {1,2,3};
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for(ThreadInfo threadInfo : threadInfos){
            System.out.println("["+ threadInfo.getThreadId()+"]"+threadInfo.getThreadName());
        }
    }
}
