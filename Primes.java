public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code

        int n = Integer.parseInt(args[0]);
        
        // Step 1: Create a boolean array for marking primes
        boolean[] isPrime = new boolean[n+1];
        for (int i = 0; i < isPrime.length; i++)
            isPrime[i] = true;

        isPrime[0] = false; // 0 is not prime
        isPrime[1] = false; // 1 is not prime

        int i = 2;
        while (i < n) {
            int mult = 2;
            while (i * mult <= n) {
                isPrime[i * mult] = false;
                mult++;
            }
            i++;
        }
        
        // Step 3: Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

