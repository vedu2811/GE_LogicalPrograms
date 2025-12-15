public class Stopwatch {

    long startTime;
    long endTime;
    boolean isRunning;

    public Stopwatch() {
        this.startTime = 0;
        this.endTime = 0;
        this.isRunning = false;
    }

    public void start() {
        if (isRunning) {
            System.out.println("Stopwatch is already running.");
            return;
        }
        this.startTime = System.nanoTime();
        this.isRunning = true;
    }

    public void end() {
        if (!isRunning) {
            System.out.println("Stopwatch is not running. Start it first.");
            return;
        }
        this.endTime = System.nanoTime();
        this.isRunning = false;
    }

    public double getElapsedTimeSeconds() {
        if (startTime == 0 || endTime == 0 || isRunning) {
            return 0.0;
        }
        long elapsedNanos = endTime - startTime;
        return (double) elapsedNanos / 1_000_000_000.0;
    }
}