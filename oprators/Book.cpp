#include<iostream>
using namespace std;
#include<string.h>
#include "Book.h"

Book::Book()
{
	cout<<"default book:"<<endl;
	strcpy(this->bname,"\0");
}
Book::Book(char* lname,char* dname,char* aname,char* bname):Library(lname),Distributor(dname),Authar(aname)
{
	cout<<"copying bname:"<<endl;
	strcpy(this->bname,bname);
}
void Book::display()
{
	cout<<"dispalying information:"<<endl;
	Library::display();
	Distributor::display();
	Authar::display();
	cout<<"book:"<<this->bname<<endl;
}
