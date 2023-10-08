//#include<iostream>
//using namespace std;
//#include<string.h>
//class string1
//{
//	int len;
//	char* ch;
//	public:
//		string1()
//		{
//		}
//		string1(char* str1)
//		{
//			len=strlen(str1);
//			ch=new char(len);
//			strcpy(ch,str1);
//		}	
//		string1& operator=(string1&);
//		void display()
//		{
//			cout<<"string:"<<ch<<endl;	
//		}	
//};
//string1& string1::operator=(string1& str1)
//{
//	len=str1.len;
//	delete[] this->ch;
//	ch=new char(len+1);
//	strcpy(this->ch,str1.ch);
//	return *(this);
//}
//int main()
//{
//	string1 s1("bhavesh");
//	string1 s2("gharat");
//	s2.display();
//	s2=s1;
//	s2.display();
//}
#include<iostream>
using namespace std;
class complex
{
	int real,img;
	public:
		complex(){
		}
		complex(int real,int img)
		{
			this->real=real;
			this->img=img;
		}
		complex operator+(complex& c2)
		{
			this->real=this->real+c2.real;
			this->img=this->img+c2.img;
			return *(this);
		}
		complex operator-()
		{
			this->real=-(this->real);
			this->img=-(this->img);
			return *(this);
		}
		friend int operator==(complex& c1,complex& c2)
		{
			if(c1.real==c2.real && c1.img==c2.img)
				return 1;
			else 
				return 0;
		}
		void display()
		{
			if(img<0)
			{
				cout<<real<<" "<<img<<"i"<<endl;
			}
			else
				cout<<real<<"+"<<img<<"i"<<endl;
		}
};
int main()
{
	complex c1(3,2);
	complex c2(5,6);
	c2=c2+c1;
	c2.display();
	c2=-c2;
	c2.display();
	if(c1==c2)
		cout<<"yes"<<endl;
	else
		cout<<"no"<<endl;
}
