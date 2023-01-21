package department;
import department.Department;
import department.Project;
import employee.Employee;
import employee.Manager;
import employee.Admin;
public class TestMainProgram {
	public static void main(String[] args) {
		TestMainProgram test=new TestMainProgram();
		Employee employee=new Employee("geetha",21,40000,"Bengaluru","7569876979");

		Admin admin=new Admin("kavii", 10);
		System.out.println("--------------Admin Details-------------\n");
		admin.display();

		Manager manager=new Manager("Reeman",041,"Financial Analysts");
		System.out.println("---------------Manager Details------------\n");
		manager.output();

		Department department=new Department("Finance",042);
		System.out.println("------------Department Details---------------\n");
		department.deptOutput();

		Project project=new Project("Footstep Power Generations..!","Isaivizhi,Rakesh,Nivin");
		System.out.println("---------------Project and Team Details--------------\n");
		project.projectOutput();
	}
}

