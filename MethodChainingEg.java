
class SingleDemo{
	
	static SingleDemo osd=null;
	private SingleDemo()
	{
		System.out.println("SingleDemo() cons...");
	}
	
	public static SingleDemo getInstance()
	{
		if(osd==null)
		{
			osd = new SingleDemo();
			
			return osd;
		}
		else
		{
			return osd;
		}
	}
	
	public void met()
	{
		System.out.println("met()............invoked");
	}
}

public class MethodChainingEg {
	public static void main(String[] args) {
		  SingleDemo.getInstance();
		  SingleDemo.getInstance();
		  SingleDemo sd = SingleDemo.getInstance();
		  
		  sd.met();
	}

}
