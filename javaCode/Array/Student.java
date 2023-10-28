public class Student {
	private String id;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private String mobile;
	static int count;
	static {
		count = 0;
	}
	private String generateCode()
	{
		count++;  //normal function can accese static variable
		if(this.name != null)
		{
			return this.name.substring(0,3)+count;
		}
		else
			return "str"+count;
	}
	public static void f1() {
		//static function get accese of only static variable
	}
	public Student() 
	{
		this(null,0,0,0,null);
	}
	public Student(String name, int m1, int m2, int m3, String mobile) 
	{
		this.name = name;
		this.id = generateCode();
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.mobile = mobile;
		
	}
//	public void setId(int id)
//	{
//		this.id = id;
//	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMarksm1(int m1)
	{
		this.m1 = m1;
	}
	public void setMarksm2(int m2)
	{
		this.m2 = m2;
	}
	public void setMarksm3(int m3)
	{
		this.m3 = m3;
	}
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	public String getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public int getMarksm1() 
	{
		return m1;
	}
	public int getMarksm2()
	{
		return m2;
	}
	public int getMarksm3()
	{
		return m3;
	}
	public String getMobile()
	{
		return mobile;
	}
	public String toString()
	{
		return "id :"+id+"\nname: "+name+"\nm1: "+m1+"\nm2: "+m2+"\nm3: "+m3+"\nMobile: "+mobile; 
	}

}
