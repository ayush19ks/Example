



public class TwoMainMethods {
	public static void main(String args[])
	{
		System.out.println("Heloooooooo");
		SingletonDemo obj = SingletonDemo.getInstance();
		
		if(obj!=null){ System.out.println("object created1111");}
		
		SingletonDemo obj1 = SingletonDemo.getInstance();
		
		if(obj1!=null){ System.out.println("object created2222");}
		
		obj.met();
	}
}
