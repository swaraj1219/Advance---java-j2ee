public class PerformanceTest {
    public static void main(String[] args) {

        int n = 10000;

        // StringBuffer Test
        long startTimeBuffer = System.nanoTime();
        StringBuffer sbf = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sbf.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        // StringBuilder Test
        long startTimeBuilder = System.nanoTime();
        StringBuilder sbd = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sbd.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        // Output results
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        // Conclusion
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder");
        }
    }
}