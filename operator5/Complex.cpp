#include<iostream>
using namespace std;
#include "Complex.h"

Complex::Complex()
{
	cout<<"default construtor";
}
Complex::Complex(int x,int y)
{
	cout<<"copying vales:"<<endl;
	real=x;
	img=y;
}
Complex Complex::operator+(int a)
{
	cout<<"adding values"<<endl;
	this->real=this->real+a;
	this->img=this->img+a;
	return *(this);
}
Complex operator+(int a,Complex &c)
{
	cout<<"new addtion"<<endl;
	c.real=c.real+a;
	c.img=c.img+a;
	return c;
}
void Complex::display()
{
	if(img>0)
		cout<<"values:"<<real<<"+"<<img<<"i"<<endl;
	else
		cout<<"values:"<<real<<" "<<img<<"i"<<endl;
}
