#include "Point.h"
#include "Line.h"
#include<iostream>
using namespace std;
Point::Point()
{
	this->x=this->y=0;
}
Point::Point(int x,int y)
{
	this->x=x;
	this->y=y;
}
void Point::display()
{
	cout<<"x="<<x<<","<<"y="<<y<<endl;	
}
