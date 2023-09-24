#ifndef STRING_H
#define STRING_H

class String
{
	public:
		String(String&);
		String(char*);
		String& operator=(String&);
		void display();	
		protected:
		int len;
		char* ch;
};

#endif
