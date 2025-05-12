public class Multiples {
    public static void main(String[] args) {
        // Create a catcher variable
        int total = 0;

        // Iterate through each number below 1000
        for (int i = 0; i < 1000; i++) {
            // Find out which numbers divide by 3 or 5.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                total++;
            }
        }
        System.out.println(total);
    }
}