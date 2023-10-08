#include<iostream>
#include<vector>
using namespace std;
int main()
{
    vector<int> v1{1,2,3,4,5,6,7,8};
    vector<int> v2{3,4,5,6,1};
    // v2 = v1;
    // cout << "v2= ";//1 2 3 4 5 6 7 8 
    for(auto it=v1.begin();it<v1.end();it++)
    {
        // cout<<*(v1.begin())<<" "<<*it<<endl;
        if(*it%2==0)
        {
            cout<<*it<<" "<<endl;
        }
    }
    //  cout<<"end v1="<<v1.end()<<endl;//error
    cout<<"end v1="<<*(v1.end())<<endl;//0
    cout<<"sizeof v1="<<v1.size()<<endl;//8
    int no1,no2;
    cout<<"enter the 2 index number between "<< v2.size()-1<<endl;
    cin>>no1>>no2;
    cout<<"addition="<<v2[no1]+v2[no2];
    // for(auto it = v2.begin() ; it != v2.end() ; ++it)
    // {
    //     cout<<*it<<" "<<endl;
    //     // cout<<"v1[3]:"<<v2[3]<<endl;
    // }
    return 0;
}