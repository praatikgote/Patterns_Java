import java.util.*;

class Pattern1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= column; j++) {

                System.out.print("*");
            }

            System.out.println();

        }

        sc.close();

    }

}