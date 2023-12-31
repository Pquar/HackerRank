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
        long max=0, min=0;
        long sumEverything = arr.stream()
                .mapToLong(num->(long) num)
                .reduce(0L,(total, element)->total+element);
        for(int i =0; i<5;i++){
            min=sumEverything;
            if(min>(sumEverything-arr.get(i))){
                min=sumEverything-arr.get(i);
            }
            if(max<(sumEverything-arr.get(i))){
                max=sumEverything-arr.get(i);
            }
        }
        System.out.println(min+" "+max);
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
