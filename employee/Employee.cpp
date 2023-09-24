#include "Employee.h"
#include<iostream>
using namespace std;
Employee::Employee()
		{
			cout<<"default employee"<<endl;
		}
Employee::Employee(int id)
		{	
			cout<<"para employee:"<<endl;
			this->id=id;
		}
void Employee::display()
		{
			cout<<"employee id:"<<id<<endl;
		}
