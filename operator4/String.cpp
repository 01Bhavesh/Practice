#include<iostream>
using namespace std;
#include<string.h>
#include "String.h"

String::String(String&)
{
	cout<<"hellow"<<endl;
}
String::String(char* cstr)
{
	cout<<"copying string:"<<endl;
	len=strlen(cstr);
	ch=new char[len+1];
	strcpy(ch,cstr);
}
String& String::operator=(String& s)
{
	cout<<"assignment:"<<endl;
	len=s.len;
	delete[] ch;
	ch=new char[len+1];
	strcpy(ch,s.ch);
	return *(this);
}
void String::display()
{
	cout<<"len="<<len<<endl;
	cout<<"string="<<ch<<endl;
}
