package employee;
public class Manager {
	private String name;
	private int manageId;
	private String department;

	public Manager(String name,int manageId, String department) {
		this.name=name;
		this.manageId=manageId;
		this.department=department;
	}
	public void output() 
	{
		System.out.println("Manager name: "+name);
		System.out.println("Manger id: "+manageId);
		System.out.println("manager organized department: "+department+"\n");
	}
	
}


/*
 * @Override public String toString() { return "Manager [name=" + name +
 * ", number=" + manageId + ", department=" + department + "]"; }
 */