package com.testingPreparation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulationHack {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
    	long result = 0;
    	long[] arr = new long[n];
    	int j = 0;
    	System.out.println(queries.length);
    	for(int i = 0;i < queries.length;i++) {

    			int a = queries[i][j];
    			int b = queries[i][j+1];
    			long k = queries[i][j+2];
    		for(int c = a-1;c < b; c++) {
    			arr[c] += k;
    			if(arr[c] > result) result = arr[c];
    		}
    	}
    	
    	return result;
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        ///BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kalakambam.mahesh\\Documents\\New folder\\something.txt"));
    	Scanner scanner = new Scanner(br);
    	scanner.useDelimiter("\\Z");
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
                //System.out.println(queries[i][j]);
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
