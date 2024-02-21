import ArrayExercise.Array;
import Exercise2.Customer;
import Exercise2.Sale;
public class Main {
	public static void main(String[] args) {
//      MyArray myArray = new MyArray();

      Sale sale1 = new Sale(new Customer("Koko", "Premium"), "2024-02-21");
      Sale sale2 = new Sale(new Customer("Momo", "Gold"), "2024-02-21");
      Sale sale3 = new Sale(new Customer("Dara", "Silver"), "2024-02-21");
      Sale sale4 = new Sale(new Customer("David", "Normal"), "2024-02-21");

      sale1.setServiceExpense(15);
      sale1.setProductExpense(20);

      sale2.setServiceExpense(15);
      sale2.setProductExpense(20);

      sale3.setServiceExpense(15);
      sale3.setProductExpense(20);

      sale4.setServiceExpense(15);
      sale4.setProductExpense(20);

      sale1.DisplayInfo();
      sale2.DisplayInfo();
      sale3.DisplayInfo();
      sale4.DisplayInfo();
  }
}
