//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends



//Solution Using C++ Language

class Solution
{
    public:
    //Function to check if brackets are balanced or not.
    int check(char a,char b){
        if(a=='('&& b==')'){
            return 1;
        }
        if(a=='['&& b==']'){
            return 1;
        }
        if(a=='{'&& b=='}'){
            return 1;
        }
        return 0;
    }
    bool ispar(string s)
    {
        // Your code here
        vector<char>c;
        if(s.length()==1){
            return 0;
        }
        for(int i=0;s[i]!='\0';i++){
            if(s[i]=='('||s[i]=='['||s[i]=='{'){
                c.push_back(s[i]);
            }
            if(s[i]==')'||s[i]==']'||s[i]=='}'){
                if(c.size()==0){
                    return 0;
                }
                if(!check(c.back(),s[i])){
                    return 0;
                }
                c.pop_back();
            }
        }
        if(c.size()==0){
            return 1;
        }
        else{
            return 0;
        }
    }

};

//{ Driver Code Starts.

int main()
{
   int t;
   string a;
   cin>>t;
   while(t--)
   {
       cin>>a;
       Solution obj;
       if(obj.ispar(a))
        cout<<"balanced"<<endl;
       else
        cout<<"not balanced"<<endl;
   }
}
// } Driver Code Ends