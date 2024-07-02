//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.math.BigInteger;
import java.util.*;

class LargeSum {
    public static void main(String args[]) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y)
    {
        BigInteger a = new BigInteger(X);
        BigInteger b = new BigInteger(Y);
        BigInteger c = new BigInteger(String.valueOf(0));
        c=a.add(b);
        return c.toString();
    }
}