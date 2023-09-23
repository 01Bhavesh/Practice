#include <iostream>
#include "Point.h"
#include "Shapes.h"
#include "Line.h"
#include "Rectangle.h"
#include "Square.h"
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
{
	Point p1(2,3);
	p1.display(); 
	Point start(10,20);
	Point end(15,25);
	int thickness=2;
	Line l1(start,end,thickness);
	l1.display();
	Rectangle r1(12,8,5);
	r1.display();
	Square s1(5,1);
	s1.display();
	
	return 0;
}
