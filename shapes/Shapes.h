#ifndef SHAPES_H
#define SHAPES_H

class Shapes
{
	protected:
		int thickness;
	public:
		Shapes();
		Shapes(int thickness);
		virtual void display()=0;
		~Shapes();
	
};

#endif
