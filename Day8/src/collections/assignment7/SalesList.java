package collections.assignment7;
import java.util.*;
public class SalesList {
	protected ArrayList<SalesTransaction> sales;
	
	public SalesList() {
		sales=new ArrayList<>();
	}
	
	public void addSales() {
		SalesTransaction sl = new SalesTransaction();
		sl.acceptData();
		sales.add(sl);
	}
	
	public void displayAllSales() {
		sales.forEach(System.out::println);
	}
	
//	public void updateSales
}
