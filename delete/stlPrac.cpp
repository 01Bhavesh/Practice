//#include<iostream>
//
//#include <algorithm>
//using namespace std;
//int main()
//{
//	int arr[]={5,4,2,8,1,6,7};
//	sort(begin(arr),end(arr));
//	for(int:arr)
//	{
//		cout<<arr<<endl;
//	}
//}

#include <algorithm>
#include <iostream>
  
int main()
{
    int arr[] = {3, 5, 1, 2, 4};
  
    // Sort the array in ascending order
    std::sort(std::begin(arr), std::end(arr));
  
    // Print the sorted array
    for (int i : arr)
    {
        std::cout << i << " ";
    }
  
     
  
    return 0;
}
