import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        else if (num <= 3) return true;
        else if (num % 2 == 0 || num % 3 == 0) return false;

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
            i += 6;
        }

        return true;
    }

    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n <= 0) return primes;

        for (int i = 2; primes.size() < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> primes = generatePrimes(n);
        System.out.println(primes);
    }
}