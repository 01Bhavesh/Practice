#include <iostream>
#include "Complex.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
{
	Complex c1(4,5);
	c1.display();
	c1=c1+5;//c1=c1.operator+(int)
	c1.display();
	c1=7+c1;//c1=operator+(int,c1)
	c1.display();
	return 0;
}
