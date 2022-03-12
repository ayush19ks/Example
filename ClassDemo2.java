class Student{
	int id;
	String name;
	float marks;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Student() invoked");
	}
	
	void print()
	{
		System.out.println("Details:: "+id+"\t"+name);
	}
	
}

public class ClassDemo2 {
	public static void main(String a[])
	{
		Student sarr[] = new Student[5];
		
		sarr[0] = new Student(1, "Kumar");
		sarr[1] = new Student(2, "Kishore");
		sarr[2] = new Student(3, "Krishna");
		sarr[3] = new Student(4, "Kiran");
		sarr[4] = new Student(5, "Abc");
		
		for(Student so:met(sarr))
		{
			so.print();
		}
	}
	
	
	Student[] met(Student []sparr)
	{
		return sparr;
	}
	
	
}
