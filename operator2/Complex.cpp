#include<iostream>
using namespace std;
#include "Complex.h"

Complex::Complex()
{
	cout<<"default complex:"<<endl;
	real=img=0;
}
Complex::Complex(int x,int y)
{
	cout<<"copying values:"<<endl;
	this->real=x;
	this->img=y;
}
//Complex Complex::operator+(Complex &c)
//{
//	//Complex temp;
//	c.real=this->real+c.real;
//	c.img=this->img+c.img;
//	return c;
//}
Complex Complex::operator+(Complex &c)
{
	//Complex temp;
	this->real=this->real+c.real;
	this->img=this->img+c.img;
	return *(this);
}
//Complex Complex::operator-(Complex &c)
//{
//	Complex temp;
//	temp.real=this->real-c.real;
//	temp.img=this->img-c.img;
//	return temp;
//}
Complex Complex::operator-(Complex &c)
{
	
	c.real=this->real-c.real;
	c.img=this->img-c.img;
	return c;
}

void Complex::display()
{
	cout<<"values of x&y:"<<endl;
	if(img<0)	
	{
		cout<<real<<" "<<img<<"i"<<endl;
	}	
	else
		cout<<real<<"+"<<img<<"i"<<endl;	
}
