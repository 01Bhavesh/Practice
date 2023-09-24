#ifndef COMPLEX_H
#define COMPLEX_H

class Complex
{
	public:
		Complex();
		Complex(int x,int y);
		Complex operator++();
		Complex operator-();
		Complex operator++(int);
		void display();
	protected:
		int real,img;
};

#endif
