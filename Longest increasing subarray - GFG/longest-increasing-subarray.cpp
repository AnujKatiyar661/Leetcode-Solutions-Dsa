//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;



// } Driver Code Ends


class Solution{
  public:
    long lenOfLongIncSubArr( long a[], long n ) {
    long r{ 1 }, i{ r };
    while ( --n )
        if ( a[ n ] > a[ n - 1 ] ) ++i;
        else if ( i > r ) r = i, i = 1;
        else i = 1;
    return max( r, i );
} // T: 0.11+
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long int n;
        cin >> n;
        long int arr[n], i;
        for (i = 0; i < n; i++) 
            cin >> arr[i];
        Solution obj;
        cout << obj.lenOfLongIncSubArr(arr, n) << endl;
    }
    return 0;
}
// } Driver Code Ends