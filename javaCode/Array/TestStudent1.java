import java.util.Scanner;
public class TestStudent1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. add student\n2. display all\n3. display by id\n4. update mobile\n5. delete by id\n6. exit\nchoice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				StudentService.addStudent();
//				 StudentService s1=new StudentService();
//				 s1.addStudent();
				
				break;
			case 2:
				StudentService.displayAll();
				break;
			case 3:
				StudentService.displayById();
				break;
			case 4:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("enter the id: ");
				String id = sc1.nextLine();
				int id1 = StudentService.searchById(id);
				if(id1 != -1) {
					StudentService.updateById(id1);
				}
				break;
			case 5:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("enter id you want to delete:");
				String delid = sc2.nextLine();
				if(StudentService.deleteById(delid)==false) {
					System.out.println("Enter a valid id.....");
				}else {
					System.out.println("deleted....");
				}
				
				break;
			case 6:
				System.out.println("thank you ...!");
				System.exit(0);
				break;
			
			}
		}while(true);
//		StudentService.sc1.close();
	}
	
}
