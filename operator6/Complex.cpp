#include<istream>
using namespace std;
#include "Complex.h"

Complex::Complex()
{
	cout<<"default values:"<<endl;
	x=y=0;
}
void operator <<(ostream &out,const Complex &c)
{
	out<<c.x;
	out<<"+"<<c.y<<"i"<<endl;
}
void operator >>(istream &in,Complex &c)
{
	cout<<"enter value of real:"<<endl;
	in>>c.x;
	cout<<"enter the imaginary:"<<endl;
	in>>c.y;
}
//void Complex::display()
//{
//	if(y<0)
//		cout<<x<<" "<<y<<"i"<<endl;
//	else
//		cout<<x<<"+"<<y<<"i"<<endl;
//}
