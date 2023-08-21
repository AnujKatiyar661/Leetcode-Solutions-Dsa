//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution
{
    public:
    //Function to find the maximum occurring character in a string.
    char getMaxOccuringChar(string str)
    {
        // Your code here
        int max = INT_MIN;int t=0;
        int CHAR =256;
        int count[CHAR]={0};
        for(int i=0;i<str.length();i++){
            count[str[i]]++;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]>max){
                max=count[i];
                t=i;
            }
        }
        
        return (char) t;
    }

};

//{ Driver Code Starts.

int main()
{
   
    int t;
    cin >> t;
    while(t--)
    {
        string str;
        cin >> str;
    	Solution obj;
        cout<< obj.getMaxOccuringChar(str)<<endl;
    }
}
// } Driver Code Ends