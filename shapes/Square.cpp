#include<iostream>
using namespace std;
#include "Square.h"

Square::Square()
{
}
Square::Square(int side,int thickness):Shapes(thickness)
{
	this->side=side;
}
void Square::display()
{
	cout<<"\narea of square="<<side*side<<endl;
}
