#include<iostream>
using namespace std;
#include<string.h>
#include "Library.h"
#include "Distributor.h"
#include "Book.h"
Library::Library()
{
	cout<<"default of library:"<<endl;
	strcpy(lname,"\0");
}
Library::Library(char* lname)
{
	cout<<"copying lname:"<<endl;
	strcpy(this->lname,lname);
}
void Library::display()
{
	cout<<"lname="<<this->lname<<endl;
}
