package week3.day1.assigments;

public class Students 

{
	public void getStudentInfo(int id) 
	
	{
		
		System.out.println("ID:"+id);

	}

	public void getStudentInfo(int id, String name) 
	{
		System.out.println("ID:"+id +" " + "Name:" + name);
	}
	
	public void getStudentInfo(String email,long number) 
	{
		System.out.println("email:" + email +" "+ "PHNO:" + number);
	}
	
	public static void main(String[] args) 
	
	{
		
		Students object = new Students();
		
		object.getStudentInfo(3685);
		object.getStudentInfo(3685, "James");
		object.getStudentInfo("James@gmail.com", 984653230);
		

	}

}
