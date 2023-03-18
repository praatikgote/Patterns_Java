import java.util.*;

public class Zero_One_Triangle {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows binary 0 & 1: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                int sum = i + j;

                if (sum % 2 == 0) {
                    System.out.print("0");

                } else {
                    System.out.print("1");
                }

            }

            System.out.println();

        }

        sc.close();

    }

}
