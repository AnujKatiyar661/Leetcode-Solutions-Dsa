//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;

// } Driver Code Ends





class Solution
{
    public:
    vector<int>memo;
    int dp(int arr[], int n)
    {
         if(n<=0)
        {
            return 0;
        }
        
        if(memo[n]!=-1)
        {
            return memo[n];
        }
        
        int canhavemax=dp(arr,n-2)+arr[n-1];
        int canthavemax=dp(arr,n-1);
        memo[n]=max(canhavemax,canthavemax);
        return memo[n];
    }
    int FindMaxSum(int arr[], int n)
    {
       memo.resize(n+1,-1);
       return dp(arr,n);
    }
};



//{ Driver Code Starts.
int main()
{
    //taking total testcases
	int t;
	cin>>t;
	while(t--)
	{
	    //taking number of houses
		int n;
		cin>>n;
		int a[n];
		
		//inserting money of each house in the array
		for(int i=0;i<n;++i)
			cin>>a[i];
		Solution ob;
		//calling function FindMaxSum()
		cout<<ob.FindMaxSum(a,n)<<endl;
	}
	return 0;
}

// } Driver Code Ends