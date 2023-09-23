#include <iostream>
using namespace std;
#include "Line.h"
Line::Line()
{
}
Line::Line(Point start,Point end,int t):Shapes(t)
{
	this->start=start;
	this->end=end;
}
void Line::display()
{
	cout<<"start point: "<<endl;
	this->start.display();
	cout<<"end point:"<<endl;
	this->end.display();
//	cout<<"thickness:"<<this->thickness;
}
