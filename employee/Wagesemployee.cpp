#include<iostream>
using namespace std;
#include "Wagesemployee.h"
#include "Employee.h"

Wagesemployee::Wagesemployee()
{
	cout<<"default wagesemployee:"<<endl;
	hrs=100;
	rate=10;
}
Wagesemployee::Wagesemployee(int id,int hrs,int rate):Employee(id)
{
	cout<<"default wagesemployee:"<<endl;
	this->hrs=hrs;
	this->rate=rate;
}
int Wagesemployee::findsalary()
{
	return hrs*rate;
}
void Wagesemployee::display()
{
	Employee::display();
	cout<<hrs<<endl;
	cout<<rate;
}

