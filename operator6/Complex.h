#ifndef COMPLEX_H
#define COMPLEX_H
#include<iostream>
class Complex
{
	public:
		Complex();
		Complex(int,int);
		friend void operator << (ostream &out,const Complex &c);
		friend void operator >> (istream &in,Complex &c);
//		void display();
	protected:
		int x,y;
};

#endif
