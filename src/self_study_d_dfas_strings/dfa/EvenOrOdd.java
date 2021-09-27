package self_study_d_dfas_strings.dfa;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int state = 0;  //initial state

        int input;
        while ( (input = sc.nextInt())==1 || input == 0) {
            switch (state) {
                case 0:
                    if (input == 1)
                        state = 1;
                    break;
                case 1:
                    if (input == 0)
                        state = 0;
                    break;
            }
        }

        System.out.printf("%s\n", (state==0)?"even":"odd");
        sc.close();
    }
}
