import java.util.Scanner;

public class LibraryFineCalculator {

    public static int calculateFine(int days) {

        int fine = 0;

        if (days <= 5) {
            fine = days * 2;
        }

        else if (days <= 10) {
            fine = (5 * 2) + ((days - 5) * 5);
        }

        else {
            fine = (5 * 2) + (5 * 5) + ((days - 10) * 10);
        }

        return fine;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter late return days: ");
        int days = sc.nextInt();

        int fine = calculateFine(days);

        System.out.println("Library Fine = ₹" + fine);

        sc.close();
    }
}

