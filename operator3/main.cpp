#include <iostream>
#include "Complex.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	Complex c1(2,5);
	Complex c2(3,5);
	c2=++c2;//c2=c2.operator++()
	c2.display();
	c2=-c2;
	c2.display();
	Complex c4;
	c4=c2++;
	c4.display();
	
	return 0;
}
