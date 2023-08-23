package simpleSum;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            x= Integer.parseInt(br.readLine());
            y= Integer.parseInt(br.readLine());
            System.out.println(soma(x,y));

        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
    public static int soma(int a, int b){
        return a+b;
    }
}
