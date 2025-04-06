package collections.assignment7;

import java.util.Objects;
import java.util.Scanner;

public class SalesTransaction {
	protected int transactionId;
	protected String customerName;
	protected String product;
	protected int quantitySold;
	protected double totalAmount;

	public SalesTransaction() {

	}

	public SalesTransaction(int transactionId, String customerName, String product, int quantitySold,
			double totalAmount) {
		super();
		this.transactionId = transactionId;
		this.customerName = customerName;
		this.product = product;
		this.quantitySold = quantitySold;
		this.totalAmount = totalAmount;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerName, product, quantitySold, totalAmount, transactionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalesTransaction other = (SalesTransaction) obj;
		return Objects.equals(customerName, other.customerName) && Objects.equals(product, other.product)
				&& quantitySold == other.quantitySold
				&& Double.doubleToLongBits(totalAmount) == Double.doubleToLongBits(other.totalAmount)
				&& transactionId == other.transactionId;
	}

	@Override
	public String toString() {
		return "SalesTransaction [transactionId=" + transactionId + ", customerName=" + customerName + ", product="
				+ product + ", quantitySold=" + quantitySold + ", totalAmount=" + totalAmount + "]";
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Transaction ID");
		transactionId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer's name");
		customerName=sc.nextLine();
		System.out.println("Enter Product name ");
		product=sc.nextLine();
		System.out.println("Enter Quantity sold ");
		quantitySold=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Total amount");
		totalAmount=sc.nextDouble();
		sc.nextLine();
	}
	
}
