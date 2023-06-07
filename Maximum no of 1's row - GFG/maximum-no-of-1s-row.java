//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        
        int idx = -1;
        int reqIdx = -1, maxOneCount = 0;
        
        for(int []array : Mat)
        {
            idx++;
            int currOneCount = array.length - findOnesByBinary(array);
            if(maxOneCount < currOneCount)
            {
                maxOneCount = currOneCount;
                reqIdx = idx;
            }
        }
        
        return reqIdx;
    }
    
    public static int findOnesByBinary(int []array)
    {
        for(int left=0, right=array.length-1, mid; left<=right; )
        {
            mid = (left + right) / 2;
            
            if(array[mid] == 0)
            {
                left = mid + 1;
            }
            else
            {
                if(mid-1 < 0) return mid;
                if(array[mid-1] == 0) return mid;
                right = mid;
            }
        }
        return array.length;
    }
}
        
        
    
