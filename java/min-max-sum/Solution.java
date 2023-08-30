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
        // Write your code here
        long minNumber = 0, maxNumber = 0, sum = 0;
        minNumber= arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (arr.get(i) < minNumber) {
                minNumber = arr.get(i);
            }
            if (arr.get(i) > maxNumber) {
                maxNumber = arr.get(i);
            }
        }

        System.out.print((sum - maxNumber) + " " + (sum - minNumber));
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
