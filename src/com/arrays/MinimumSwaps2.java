package com.arrays;

import java.io.IOException;
import java.util.Scanner;

public class MinimumSwaps2 {
	
	static int minSwapCount = 0;
	
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	while (true) {
    		if (isAscending(arr)) {
        		return minSwapCount;
        	} else {
        		minSwapCount++;
        		getSwappedArray(arr);
        	}
    	}
    }
    
    static void getSwappedArray(int[] arr) {
    	int leftPointer = 0;
    	int rightPointer = arr.length - 1;
    	while (arr[leftPointer] <= arr[rightPointer]) {
    		//leftPointer++;
    		rightPointer--;
    	}
    	swap(arr, leftPointer, rightPointer);
    }

    private static boolean isAscending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}

	private static void swap(int[] arr, int leftPointer, int rightPointer) {
		int temp = arr[leftPointer];
		arr[leftPointer] = arr[rightPointer];
		arr[rightPointer] = temp;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        /*int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }*/
        int[] arr = {4, 3, 1, 2};
        int res = minimumSwaps(arr);
        System.out.println(res);
        
        /*bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}

