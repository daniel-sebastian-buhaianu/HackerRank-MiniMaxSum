import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long maxSum = Long.MIN_VALUE;
        long minSum = Long.MAX_VALUE;
        
        for (int i = 0, n = arr.size(); i < n; i++) {
            long sum = 0;
            
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    sum += arr.get(j);
                }
            }
            
            if (sum > maxSum) {
                maxSum = sum;
            }
            
            if (sum < minSum) {
                minSum = sum;
            }
        }
        
        System.out.print(minSum + " " + maxSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
