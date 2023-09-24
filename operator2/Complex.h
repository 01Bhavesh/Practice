#ifndef COMPLEX_H
#define COMPLEX_H

class Complex
{
	public:
		Complex();
		Complex(int x,int y);
		Complex operator +(Complex &c);
		Complex operator -(Complex &c);
		void display();
	protected:
		int real,img;
};

#endif
