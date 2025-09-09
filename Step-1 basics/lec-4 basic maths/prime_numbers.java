import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is prime or not:");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Sorry, " + n + " is not a prime number");
        } else {
            boolean isPrime = true;

            // check divisors up to sqrt(n)
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Congo! " + n + " is a prime number");
            } else {
                System.out.println("Sorry, " + n + " is not a prime number");
            }
        }

        sc.close();
    }
}
