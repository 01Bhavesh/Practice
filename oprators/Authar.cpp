#include<iostream>
using namespace std;
#include<string.h>
#include "Authar.h"

Authar::Authar()
{
	cout<<"default Authar:"<<endl;
	strcpy(this->aname,"\0");
}
Authar::Authar(char* aname)
{
	cout<<"copying aname:"<<endl;
	strcpy(this->aname,aname);	
} 
void Authar::display()
{
	cout<<"display Authar:"<<this->aname<<endl;
	//Library::display();
}
