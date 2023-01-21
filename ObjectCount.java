package object;

public class ObjectCount {
	private static int count;
	
	public ObjectCount() 
	{
		count++;
	}
	public static void main(String[] args) {
		ObjectCount object1=new ObjectCount(); 
		ObjectCount object2=new ObjectCount(); 
		ObjectCount object3=new ObjectCount(); 
		ObjectCount object4=new ObjectCount();
		
		System.out.println("Number of Object Created: "+ObjectCount.count);
	}

}
