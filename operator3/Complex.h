#ifndef COMPLEX_H
#define COMPLEX_H

class Complex
{
	public:
		Complex();
		Complex(int x,int y);
		Complex operator++();//pre-increment
		Complex operator-();
		Complex operator++(int);//post-increment
		void display();
	protected:
		int real,img;
};

#endif
