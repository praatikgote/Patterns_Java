import java.util.*;

class Table {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to display table: ");
        int noTable = sc.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(noTable + "*" + i + " = " + noTable * i);

            sc.close();
        }
    }
}