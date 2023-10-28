
import java.util.Scanner;
public class StudentService {
	
static Student[] stud;
static int cnt;
static {
	stud = new Student[100];
	stud[0] = new Student("ramesh", 45,65,75,"120345");
	stud[1] = new Student("ganesh",50,60,70,"214595");
	cnt=2;
}
static Scanner sc1 = new Scanner(System.in);
public static void addStudent()
{
	
	System.out.println("enter the name:");
	String name = sc1.nextLine();
	System.out.println("enter the marks m1:");
	int m1 = sc1.nextInt();
	System.out.println("enter the marks m2:");
	int m2 = sc1.nextInt();
	System.out.println("enter the marks m3:");
	int m3 = sc1.nextInt();
	sc1.nextLine();
	System.out.println("enter number:");
	String num = sc1.nextLine();
	stud[cnt] = new Student(name, m1, m2, m3, num);
	cnt++;
}
public static void displayAll()
{
	for(int i = 0 ; i<cnt ; i++)
	{
		System.out.println(stud[i]);
	}
}
//public static int StudLength()
//{
//	return stud.length;
//}
public static void displayById()
{
//	System.out.println("showing index from 0 to "+StudentService.StudLength());
	for(int i = 0 ; i < cnt ; i++)
	{
		
			System.out.println(StudentService.stud[i].getId());
	}
	System.out.println("enter id: ");
	String id = sc1.nextLine();
	for(int i = 0 ; i<cnt ; i++)
	{
		if (stud[i].getId().equals(id))
		{
			System.out.println(stud[i]);
		}
		else
		{
			System.out.println("enter correct data: ");
		}
	}
}
public static int searchById(String id) 
{
for(int i = 0 ; i<cnt ; i++)
{
	if(stud[i].getId().equals(id))
	{
		System.out.println(stud[i]); // toString() return print
		return i;
	}
}
System.out.println("invalid data :");
return -1;
}
public static void updateById(int id)
{
	System.out.println("enter new number: ");
	String num = sc1.nextLine();
	stud[id].setMobile(num); 
	System.out.println(stud[id]);
}
public static boolean deleteById(String delid) {
	int i = 0;
	boolean flag=false;
	for( ; i<cnt ; i++)
	{
		if(stud[i].getId().equals(delid))
		{
		   flag=true;
		   break;
		}
	}
	System.out.println(i);
	if(flag) {
		for(int j=i;j<cnt;j++) {
			stud[j]=stud[j+1];
		}
		return true;
	}
		
		return false;	
}
}
