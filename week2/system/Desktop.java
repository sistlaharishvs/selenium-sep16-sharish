package org.system;

public class Desktop extends Computer

{
	
	public void desktopSize() 
	{
		System.out.println("DesktopSize");
	}
	
	public static void main(String[] args)
	{
		
		Desktop object = new Desktop();
		object.computerModel();
		object.desktopSize();
		
	}
	

}
