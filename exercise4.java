import java.util.Scanner;
public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a short date
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        // Extract year, month, and day from the short date
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8));

        // Convert the month number to the corresponding month name
        String monthName = getMonthName(month);

        // Display the full date representation
        System.out.println(monthName + " " + day + ", " + year);

        scanner.close();
    }

    // Method to convert month number to month name
    private static String getMonthName(int month) {
        String[] monthNames = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month];
	}

}
