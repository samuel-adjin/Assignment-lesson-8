package prob3;
import java.util.*;

public class Marketing implements Comparable <Marketing> {
	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		return salesamount == ((Marketing) obj).salesamount &&
				employeename.equals(((Marketing) obj).getEmployeename()) &&
				productname.equals(((Marketing) obj).getProductname());
	}

	@Override public int compareTo(Marketing o) {
		int compareSales = Double.compare(this.salesamount, o.salesamount);
		if (compareSales != 0) return compareSales;
		int compareName = this.employeename.compareTo(o.employeename);
		if (compareName != 0) return compareName;
		return this.productname.compareTo(o.productname);
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}

	@Override
	public String toString() {
		return employeename + " " + productname + " " + salesamount;
	}


	public static List<Marketing> listMoreThan1000(List<Marketing>list){
		ArrayList<Marketing> market = new ArrayList<>();
		for(Marketing m : list){
			if(m.getSalesamount()>1000) market.add(m);
		}
		Collections.sort(market);
		return market;
	}

	public static void main(String[] args) {

	// Create instance for marketing object
	Marketing m1 = new Marketing("Bruce Tom","Coke", 3360);
	Marketing m2= new Marketing("Paul Corozza","Pepsi", 2000);
	Marketing m3 = new Marketing("Joe Lermon","Fanta", 1380);
	Marketing m4 = new Marketing("Anne","Dow", 250);
	Marketing m5 = new Marketing("Thomas Jefferson","Energy Drink", 2100);

	// Adding data to ArrayList
	ArrayList<Marketing> marketings = new ArrayList<>();
	marketings.add(m1);
	marketings.add(m2);
	marketings.add(m3);
	marketings.add(m4);
	marketings.add(m5);

	//Showing data after adding
	System.out.println("\nAdding data .............");
	System.out.println(marketings);
	System.out.println("The size of the list is = " + marketings.size());

	//Removing the object m3
	System.out.println("After removing Joe Lermon............");
	marketings.remove(m3);
	System.out.println();
	System.out.println(marketings);
	System.out.println("The size of the list is = " + marketings.size());
	System.out.println();

	//Get marketing object by its position
	System.out.println("Getting the marketing data by using index..............");
	System.out.println(marketings.get((2)));

	//Set the marketing object by its position
	Marketing m6 = new Marketing("Jackie","Chan", 26000);
	System.out.println();
	marketings.set(3,m6);
	System.out.println("Updating after change Thomas Jefferson to Jackie Chan..................");
	System.out.println(marketings);
	System.out.println();
	System.out.println("Sorting by sale amount ...............");
	//marketings.sort((Marketing m11, Marketing m22) -> Double.compare(m22.getSalesamount(), m11.getSalesamount()));
	Collections.sort(marketings);
	System.out.println(marketings);
	System.out.println();
	System.out.println("Sorting the the employees who have sales amount more than 1000USD");
	System.out.println(listMoreThan1000(marketings));
	}



}

