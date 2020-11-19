import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println("solution");
        int res = countPrimes(3);
        System.out.println(res);
    }
    public static int countPrimes(int n) {
//        if(n<=1)
//            return 0;
//        int sum = 0;
//        for (int i=2; i<n; i++){
//            if(isPrimes(i))
//                sum++;
//        }
//        return sum;
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        for (int i = 2; i * i < n; i++)
            if (isPrim[i])
                for (int j = i * i; j < n; j += i)
                    isPrim[j] = false;

        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrim[i]) count++;

        return count;


    }
    public static boolean isPrimes(int n){
        for (int i=2; i*i <= n; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

}
