
public class Person {
	private int pid;
	private String pname;
	private String mobile;
	public Person(){
		pid = 0;
		pname = null;
		mobile = null;
	}
	public Person(int pid, String pname, String mobile)
	{
		this.pid = pid;
		this.pname = pname;
		this.mobile = mobile;
	}
	public String toString()
	{
		return "pid: "+this.pid+"\npname: "+this.pname+"\nmobile: "+this.mobile;
	}
}
