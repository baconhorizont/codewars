package codewars.kyu6.TribonacciSequence;

import java.util.Arrays;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        if (n == 0){
            return new double[]{};
        }

        double[] numbers = Arrays.copyOf(s,n);
        for (int i = 3; i < n; i++) {
                numbers[i] = numbers[i-3] + numbers[i-2] + numbers[i-1];
        }
     return numbers;
    }
}
