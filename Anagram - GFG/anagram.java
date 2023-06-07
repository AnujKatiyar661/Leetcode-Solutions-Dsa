//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        
        int lst1[]=new int[26];
        int lst2[]=new int[26];
        Arrays.fill(lst1,0);
        Arrays.fill(lst2,0);
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(int i=0; i<a.length();i++)lst1[a.charAt(i)-97]+=1;
        for(int i=0; i<b.length();i++)lst2[b.charAt(i)-97]+=1;
        for(int i=0; i<26;i++)
        {
            if(lst1[i]!=lst2[i]){
                return false;   
            }
 
        }
        return true;
    }
}
 
        
    
