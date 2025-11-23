public class sumPrime {
    
    public static int isPrime(int n) {
        if (n <= 1) return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }

    public static int sumPrime(int num) {
        if (num <= 1) {
            return 0;
        } else if (isPrime(num)) {
            return num + sumPrime(num - 1);
        } else {
            return sumPrime(num - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("sumPrime for #" + n + ": " + sumPrime(n));
    }
}