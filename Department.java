package department;

public class Department {
	private String deptname;
	private int id;
	public Department(String deptname,int id) {
		this.deptname=deptname;
		this.id=id;
	}
	public void deptOutput() 
	{
		System.out.println("Department name: "+deptname);
		System.out.println("department id: "+id+"\n");
	}
}


/*
 * @Override public String toString() { return "Department [name=" + deptname +
 * ", number=" + id + "]"; }
 */