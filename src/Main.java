import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        Fibonacci f=new Fibonacci();
//        f.printFibonacci(9);
//        Perfect p=new Perfect();
//        p.isPerfectNumber(28);
//        Prime p=new Prime();
//        p.isPrime(99);
//        Reverse r=new Reverse();
//        r.reverseNumber(3456);
//        Coupon c=new Coupon();
//        c.CouponNumber(5);
        Scanner scanner = new Scanner(System.in);
        Stopwatch stopwatch = new Stopwatch();

        System.out.println("--- Stopwatch Program ---");
        System.out.println("Press 'S' to Start the stopwatch.");
        String startInput = scanner.nextLine();

        if (startInput.equalsIgnoreCase("S")) {
            stopwatch.start();

            System.out.println("\n... Measuring time ... (Press 'E' to End the stopwatch)");

            String endInput = "";
            do {
                endInput = scanner.nextLine();
            } while (!endInput.equalsIgnoreCase("E"));

            stopwatch.end();

            double elapsed = stopwatch.getElapsedTimeSeconds();
            System.out.printf("\nElapsed Time: %.4f seconds\n", elapsed);
        } else {
            System.out.println("Stopwatch not started. Exiting.");
        }

    }
}