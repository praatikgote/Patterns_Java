import java.util.*;

class Holopatter {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= column; j++) {

                if (i == 1 || j == 1 || i == rows || j == column) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");

                }
            }

            System.out.println();

        }

        sc.close();

    }

}
