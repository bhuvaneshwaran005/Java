import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Receipt {
	private String product_name;
	private String product_id;
	private int trans_id, unit;
	private double price, paid,sub_total,tax,total,change; 
	Date shippingDate;
	DateFormat formatter;

	String line = new String(new char[80]).replace('\0', '-');
	
	public Receipt(String name, String id, int trans_id2, double price2, int unit2, double paid2) {
		this.product_name = name;
		this.product_id = id;
		this.trans_id = trans_id2;
		this.price = price2;
		this.unit = unit2;
		this.paid = paid2;
		this.setDate();
	}
	
	
	public void setDate() {
		shippingDate = new Date();
		formatter = new SimpleDateFormat("dd/mm/yyyy");
	}
	
	public String getDate() {
		return formatter.format(shippingDate);
	}
	
	public void calculateAmount() {
		sub_total = price*unit;
		tax = (sub_total * 8.25)/100;
		total = sub_total + tax;
		change = paid - total;
	}

	public void diplay(String printDate) {
		
		System.out.println(line);
		String format = "%42s\n";
		System.out.format(format, "MY STORE");
		
		String format2 = "%55s\n";
		System.out.format(format2,"123 MG RD BANGALORE KA IN 5600001");
		
		String format3 = "%45s\n";
		System.out.format(format3, "STORE #: 22222");
		
		String format4 = "%50s\n";
		System.out.format(format4, "THANK YOU FOR YOUR SHOPPING");
		
		String format1 = "%45s%d\n";
		System.out.format(format1, "TRANSACTION #: ",trans_id);
		
		String format6 = "%35s %s\n";
		System.out.format(format6, "Date:",printDate);
		
		System.out.println(line);
		
		System.out.printf("%35s%15d\n",product_name,unit);
		String format5 = "%1$35s";
		System.out.format(format5, "Unit price: ");
		System.out.printf("%15.1f\n",price);
		System.out.format(format5, "Sub total:  ");
		System.out.printf("%15.1f\n",sub_total);
		System.out.format(format5, "Tax (8.25%):");
		System.out.printf("%15.1f\n",tax);
		System.out.format(format5, "Total:      ");
		System.out.printf("%15.1f\n",total);
		
		System.out.println(line);
		
		System.out.format(format5, "Cash:       ");
		System.out.printf("%15.1f\n",paid);
		System.out.format(format5, "Change:     ");
		System.out.printf("%15.1f\n",change);
		
	}
}
