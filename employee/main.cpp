#include <iostream>
using namespace std;

#include "Employee.h"
#include "Wagesemployee.h"
#include "Salesmaneger.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
 {
	Employee e1(1);
	e1.display();
	Wagesemployee w1(2,4,10);
	w1.display();
	Salesmaneger*sm=new Salesmaneger(3,5,20,100,500);
	cout<<"salary for Salesmaneger:"<<sm->findsalary()<<endl;
	return 0;
	
}
