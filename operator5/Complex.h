#ifndef COMPLEX_H
#define COMPLEX_H

class Complex
{
	public:
		Complex();
		Complex(int,int);
		Complex operator+(int);
		friend Complex operator+(int,Complex&);
		void display();
	protected:
		int real,img;
};

#endif
