#ifndef LIBRARY_H
#define LIBRARY_H

class Library
{
	public:
		Library();
		Library(char* lname);
		void display();
	protected:
		char lname[20];
};

#endif
