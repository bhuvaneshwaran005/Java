import java.util.*;
public class MyStore {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter product Name: ");
		String name = s.nextLine();
		System.out.print("Enter product Id: ");
		String id = s.next();
		System.out.print("Enter transaction Id: ");
		int trans_id= s.nextInt();
		System.out.print("Enter product price: ");
		double price = s.nextDouble();
		System.out.print("Enter how many unit purchased: ");
		int unit = s.nextInt();
		System.out.print("Enter amount of money paid: ");
		double paid = s.nextDouble();
		
		Receipt r = new Receipt(name, id, trans_id, price, unit, paid);
		r.calculateAmount();
		
		String printdate = r.getDate();
		
		r.diplay(printdate);
	}

}
