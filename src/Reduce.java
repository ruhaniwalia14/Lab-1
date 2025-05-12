import java.sql.SQLOutput;

public class Reduce {
    public static void main(String[] args) {
        int n = 100; // starting value
        int totalsteps = 0; // counter

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            totalsteps++;
        }
        System.out.println(totalsteps);
    }
}