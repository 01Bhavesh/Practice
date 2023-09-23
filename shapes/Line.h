#ifndef LINE_H
#define LINE_H
#include "Shapes.h"
#include "Point.h"

class Line : public Shapes
{
		private:
		Point start,end;
	public:
		Line();
		Line(Point start,Point end,int t);
		void display();
};

#endif
