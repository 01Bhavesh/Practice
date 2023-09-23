#include <iostream>
using namespace std;
#include "Rectangle.h"

Rectangle::Rectangle()
{
}
Rectangle::Rectangle(int width,int height,int t):Shapes(t)
{
	this->width=width;
	this->height=height;
}
void Rectangle::display()
{
	cout<<"area of rectangle="<<width*height;
}
