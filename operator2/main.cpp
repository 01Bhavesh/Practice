#include <iostream>
#include "Complex.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
{
	Complex c1(1,4);
	Complex c2(2,6);
	
//	c1=c1+c2;//c1.operator+(&c2)
//	c1.display();
//	Complex c3;
//	c3=c1-c2;
//	c3.display();
	c2=c1-c2;
	c2.display();
	return 0;
}

