#ifndef WAGESEMPLOYEE_H
#define WAGESEMPLOYEE_H
#include "Employee.h"
class Wagesemployee : public Employee
{
	protected:
		int hrs,rate;
	public:
		Wagesemployee();
		Wagesemployee(int id,int hrs,int rate);
		int findsalary();
		void display();
};

#endif
