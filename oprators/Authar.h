#ifndef AUTHAR_H
#define AUTHAR_H

#include "Library.h"

class Authar :virtual public Library
{
	public:
		Authar();
		Authar(char* aname);
		void display();
	protected:
		char aname[20];
};

#endif
