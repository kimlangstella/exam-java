import java.util.Scanner;
public class exercise4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8));
        String monthName = getMonthName(month);
        System.out.println(monthName + " " + day + ", " + year);

        scanner.close();
    }
    private static String getMonthName(int month) {
        String[] monthNames = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month];
	}

}
