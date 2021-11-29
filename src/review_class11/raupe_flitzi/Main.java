package review_class11.raupe_flitzi;

import java.util.Scanner;

class Segment {
    String type;

    Segment next;
};

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Segment head = null;
        System.out.printf("Create:\n");

        while (true) {
            System.out.printf(": ");
            String t = sc.next();

            if (t.equals("x"))
                break;

            /// ...
        }

        System.out.printf("Action (p|g|d|s): ");
        String action, t;
        action = sc.next();

        switch (action) {
            case "p": /// Print
                /// ...
                break;
            case "g": /// GetAt
                System.out.printf("Index: ");
                int idx = sc.nextInt();

                /// ...

                break;
            case "d": /// Delete
                System.out.printf("Type: ");
                t = sc.next();

                /// ...
                break;
            case "s": /// Sublist
                System.out.printf("Type: ");
                t = sc.next();
                /// ...
                break;
        }

        check(head);

        /// ...

        sc.close();

    }

    /* Don't touch this */
    public static void check(Segment t) {
        Segment v = t;
        for (int c = 0; v != null; System.out.printf("\n%d.%d", c++, v.type.charAt(0) - 65), v = v.next)
            ;
    }

}
