
public class ParentPrac { 
		   void PrintData() {  
		      System.out.println("method of parent class");  
		      
		   } 
		   void m1() {
		   System.out.println("Prarentm1:");
}
		}
		  
		class Child extends ParentPrac {  
		   void PrintData() {  
		      System.out.println("method of child class");  
		   }  
		   void m2() {
			   System.out.println("child m2:");
		   }
		}  
		class UpcastingExample{  
		   public static void main(String args[]) {  
		        
		      ParentPrac obj1 =  new Child();  
		      ParentPrac obj2 = new Child();   
		      ((Child)obj1).m1();
		      
		      } 


		}
