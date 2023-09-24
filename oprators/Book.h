#ifndef BOOK_H
#define BOOK_H
#include "Library.h"
#include "Distributor.h"
#include "Authar.h"

class Book : public Distributor,public Authar
{
	public:
		Book();
		Book(char* lname,char* dname,char* aname,char* bname);
		void display();
	protected:
		char bname[20];
};

#endif
