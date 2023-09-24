#ifndef SALESMANEGER_H
#define SALESMANEGER_H
#include "Employee.h"
#include "Wagesemployee.h"

class Salesmaneger : public Wagesemployee
{
	protected:
		int sales,commision;
	public:
		Salesmaneger();
		Salesmaneger(int id,int hrs,int rate,int sales,int commision);	
		int findsalary();
		void display();
};

#endif
