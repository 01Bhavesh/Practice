#include<iostream>
using namespace std;
class Shapes
{
	int thickness;
	public:
		virtual void display()=0;
};
class Point
{
	int x,y;
	public:
		Point()
		{
			cout<<"default:"<<endl;
			x=y=0;
		}
		Point(int x,int y)
		{
			cout<<"copying:"<<endl;
			this->x=x;
			this->y=y;
		}
		void display()
		{
			cout<<"point"<<endl;
			cout<<"x="<<x<<" "<<"y="<<y<<endl;
		}
};
class Line:public Shapes
{
	Point a,b;
	public:
		Line(Point a,Point b)
		{
			cout<<"copying points"<<endl;
			this->a=a;
			this->b=b;
		}
		void display()
		{
			cout<<"starting point:"<<endl;
			this->a.display();
			cout<<"ending point:"<<endl;
			this->b.display();
		}
};
class rectangle:public Shapes
{
	int len,ben;
	public:
		rectangle()
		{
			len=ben=0;
		}
		rectangle(int len,int ben)
		{
			this->len=len;
			this->ben=ben;
		}
		void display()
		{
			cout<<"area:"<<this->len*this->ben;
		}
};
int main()
{
	Point p1(3,5);
	Point p2(6,4);
	p1.display();
	p2.display();
	Line l1(p1,p2);
	l1.display();
	rectangle r(2,5);
	r.display();
}
