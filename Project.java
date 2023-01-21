package department;

public class Project {

	private String projectname;
	private String projectmembers;
	public Project(String projectname,String projectmembers) {
		this.projectname=projectname;
		this.projectmembers=projectmembers;
	}
	public void projectOutput() {
		System.out.println("project name: "+projectname);
		System.out.println("project team mates: "+projectmembers+"\n");

	}
}

/*@Override
	public String toString() {
		return "Project [projectname=" + projectname + ", projectmembers=" + projectmembers + "]";
	}*/
