package class4_strings;

import java.util.Scanner;

public class KfzKennzeichen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kennzeichen = sc.nextLine();

        if (kennzeichen.matches("[A-Z]{1,2}-[0-9]{1,5}[A-Z]"))
            System.out.println("valid!");
        else
            System.out.println("invalid!");

        sc.close();
    }
}
