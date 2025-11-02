import java.util.*;

 public class Solution{
    static boolean isPrime(int num) {
        if (num < 2) return false;
        int sqrt = (int)Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) primes.add(i);
        }
        return primes;
    }
    static List<Integer> primeSums(int n) {
        List<Integer> result = new ArrayList<>();
        List<Integer> primes = generatePrimes(n);
        int sum = 0;

        for (int i = 0; i < primes.size(); i++) {
            sum += primes.get(i);
            if (sum >= n) break;
            if (isPrime(sum)) result.add(sum);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 100; 
        List<Integer> specialPrimes = primeSums(n);
        System.out.println("Primes less than " + n + " that are sum of consecutive primes starting from 2:");
        System.out.println(specialPrimes);
    }
}