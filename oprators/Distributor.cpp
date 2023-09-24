#include<iostream>
using namespace std;
#include<string.h>
#include "Distributor.h"

Distributor::Distributor()
{
	cout<<"default distributor"<<endl;
	strcpy(dname,"\0");
}
Distributor::Distributor(char* dname)
{
	cout<<"copying dname"<<endl;
	strcpy(this->dname,dname);
}
void Distributor::display()
{
	cout<<"dname="<<this->dname<<endl;
	//Library::display();

}
