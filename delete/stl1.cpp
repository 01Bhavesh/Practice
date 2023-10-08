#include<iostream>
#include<vector>
using namespace std;
int main()
{
	vector<int> v1;
	for(int i=0;i<5;i++)
	{
		v1.push_back(i);
	}
	cout<<"sizeofv1: "<<v1.size()<<endl;
	cout<<"capacity: "<<v1.capacity()<<endl;
	v1.push_back(10);
	int i=v1.size();
	for(auto it = v1.begin(); it != v1.end(); ++it)
	{
		cout<<" "<<v1.at(i-1)<<"=";
		cout<<*it;
		i--;
	}
}

