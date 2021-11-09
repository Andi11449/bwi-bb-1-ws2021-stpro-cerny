package class9_sort_and_search;

import java.util.Scanner;

public class SearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] forward = getArray(n, "linear");
        print(forward);
        int idx = binarySearch(forward, 9);
        //print(reversed);
        //print(random);

        sc.close();
    }

    public static int binarySearch(int sortedArray[], int x) {
        int l = 0;
        int r = sortedArray.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            // Check if value x is found at position m
            if (sortedArray[m] == x)
                return m;
            // If x is greater, ignore left half
            if (sortedArray[m] < x){
                l = m + 1;
            }
            // If x is smaller, ignore right half
            else{
                r= m - 1;
            }
        }
        // if the value x is not in the array we end up here
        return -1;
    }

    private static void print(int[] arr) {
        for(int e : arr)
            System.out.printf("%3d ", e);
        System.out.println();
    }

    public static int[] getArray(int n, String type){
        int[] arr = new int[n];
        for(int i=0; i < n; i++) {
            switch (type) {
                case "linear":
                    arr[i] = i;
                    break;
                case "reverse":
                    arr[i] = n-1-i;
                    break;
                case "random":
                    arr[i] = (int)(Math.random() * n);
            }
        }
        return arr;
    }


}
