public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code

        int n = Integer.parseInt(args[0]);
      
        // Create a boolean array for marking primes assuming all primes
        boolean[] isPrime = new boolean[n+1];
        for (int i = 0; i < isPrime.length; i++)
            isPrime[i] = true;

        isPrime[0] = false; // 0 is not prime
        if (n >= 1)
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
        
        // Print the index of all primes
        System.out.println("Prime numbers up to " + n + ":");
        int counter = 0;
        for (i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                counter += 1;
            }
        }
        if (n >= 2)
            System.out.println("There are " + counter + " primes between 2 and " + n + " (" + counter*100/n + "% are primes)");
    }
}