#ifndef RECTANGLE_H
#define RECTANGLE_H

#include "Shapes.h"

class Rectangle : public Shapes
{
	private:
		int width,height;
	public:
		Rectangle();
		Rectangle(int width,int height,int t);
		void display();
};

#endif
