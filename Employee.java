package employee;
public class Employee {
	String empName;
	int empId;
	double empSalary;
	String empAddress;
	String empMobileNo;
	public Employee(String empname, int empid, double salary, String empaddress, String empmobileNo)
	{
		this.empName=empname;
		this.empId=empid;
		this.empSalary=salary;
		this.empAddress=empaddress;
		this.empMobileNo=empmobileNo;
	}	  
	void shown() {
		System.out.println("employee id: "+empId);
		System.out.println("employee name: "+empName);
		System.out.println("employee salary: "+empSalary);
		System.out.println("employee address: "+empAddress);
		System.out.println("employee mobileNo: "+empMobileNo);
	}
}
