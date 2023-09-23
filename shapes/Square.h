#ifndef SQUARE_H
#define SQUARE_H

#include "Shapes.h"

class Square : public Shapes
{
	public:
		Square();
		Square(int side,int thickness);
		void display();
	protected:
		int side;
};

#endif
