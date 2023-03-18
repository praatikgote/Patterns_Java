import java.util.*;

public class Inverted_Half_Pyramid_WithNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of ros:");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(j + " ");
            }

            System.out.println();

        }

        sc.close();

    }

}
