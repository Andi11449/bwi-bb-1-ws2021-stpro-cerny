package class3_iteration;

import java.util.Scanner;

public class FitzQuack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int z = sc.nextInt();

        for(int i=1; i <= z; i++) {
            if (i % 5 == 0) {
                System.out.printf("Fitz ", i);
            } else
            {
                System.out.printf("%3d ", i);
            }
            if (i%10 == 0)
                System.out.println();
        }

        sc.close();
    }
}
