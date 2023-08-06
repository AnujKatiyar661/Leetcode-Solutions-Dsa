//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public ArrayList<String> permutation(String S)
    {
       ArrayList<String> al = new ArrayList<String>();
       int index = 0;
        Permutation(S,al,index);
        Collections.sort(al);
        return al;
    }
     
     
     void Permutation(String s, ArrayList<String> al, int index){
         
         
         if(index >= s.length()){
             al.add(s);
             return;
         }
         
         for(int j =index;j<s.length();j++){
             
             s = swap(s,index,j);
             Permutation(s, al, index + 1);
             s = swap(s, index, j);
             
         }
         
         
     }  
     
     public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}