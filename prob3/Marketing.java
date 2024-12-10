package prob3;



import java.util.*;

public class Marketing {
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
		Marketing m = (Marketing) obj;
		List<Marketing> empList = Arrays.asList(obj);
		Comparator<Marketing> nameComp = new NameComparator();
		Collections.sort(empList, nameComp)
		return employeename.equals(((Marketing) obj).getEmployeename()) &&
				productname.equals(((Marketing) obj).getProductname()) &&
				salesamount == ((Marketing) obj).salesamount;
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

	public static void main(String[] args) {

	// Create instance for marketing object
	Marketing m1 = new Marketing("Bruce Tom","Coke", 16000);
	Marketing m2= new Marketing("Paul Corozza","Pepsi", 22000);
	Marketing m3 = new Marketing("Joe Lermon","Fanta", 18000);
	Marketing m4 = new Marketing("Anne","Dow", 25000);
	Marketing m5 = new Marketing("Meng Vandeth","Energy Drink", 20000);

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
	marketings.remove(m3);
	System.out.println();

	//Removing the object m3
	System.out.println("After removing the ............");
	System.out.println(marketings);
	System.out.println("The size of the list is = " + marketings.size());
	System.out.println();
	//Get marketing object by its position
	System.out.println("Getting the marketing array by index..............");
	System.out.println(marketings.get((2)));
	System.out.println();
	//Set the marketing object by its position
	Marketing m6 = new Marketing("Jackie","Chan", 26000);
	marketings.set(3,m6);
	System.out.println("After updating the index 3..................");
	System.out.println(marketings);

	System.out.println("Sorting by sale amount ...............");
	Collections.sort(marketings,salesamount);

	}


}

