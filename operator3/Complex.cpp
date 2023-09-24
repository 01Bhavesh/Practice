#include<iostream>
using namespace std;
#include "Complex.h"

Complex::Complex()
{
	cout<<"default:"<<endl;
	real=img=0;
}
Complex::Complex(int x,int y)
{
	cout<<"copying rael&img:"<<endl;
	real=x;
	img=y;
}
Complex Complex::operator++()
{
	this->real=++this->real;
	this->img=++this->img;
	return *(this);
}
Complex Complex::operator-()
{
	this->real=-this->real;
	this->img=-this->img;
	return *(this);
}
Complex Complex::operator++(int)
{
	this->real=++this->real;
	this->img=++this->img;
	return *(this);
}
void Complex::display()
{
	if(img<0)
		cout<<"vales of real&img:"<<real<<" "<<img<<"i"<<endl;
	else
		cout<<"vales of real&img:"<<real<<"+"<<img<<"i"<<endl;
}
