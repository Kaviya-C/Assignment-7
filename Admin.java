package employee;

public class Admin {
	private String name;
	private int mobNumber;
	public Admin(String name,int mobilenumber) {
		this.name=name;
		this.mobNumber=mobilenumber;
	}
	public void display() 
	{
		System.out.println("Admin name: "+name);
		System.out.println("Admin mobile number: "+mobNumber+"\n");
	}
}

/*
 * @Override public String toString() { return "Admin [name=" + name +
 * ", number=" + number + "]"; }
 */	