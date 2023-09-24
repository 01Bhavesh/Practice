#include<iostream>
using namespace std;
#include "Salesmaneger.h"
#include "Wagesemployee.h"
#include "Employee.h"


Salesmaneger::Salesmaneger()
{
	cout<<"default:"<<endl;
}

Salesmaneger::Salesmaneger(int id,int hrs,int rate,int sales,int commision):Wagesemployee(id,hrs,rate)
{
	cout<<"para Salesemployee:"<<endl;
	this->sales=sales;
	this->commision=commision;
}
int Salesmaneger::findsalary()
{
	return (Wagesemployee::findsalary())+sales*commision;
}
void Salesmaneger::display()
{
	cout<<sales<<" "<<commision<<endl;
}
