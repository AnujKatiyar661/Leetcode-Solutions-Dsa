//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res,out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node node,PrintWriter out)
    {
        while(node != null)
        {
            out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/
class Solution
{
    static Node rev(Node head){
        if(head == null || head.next == null)
        return head;
        
        Node newHead = rev(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }
    public static Node reverse(Node node, int k)
    {
        //Your code here
        int i = 0;
        Node curr = node;
        Node prev = null;
        while(i != k){
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = null;
        prev = node;
        node = rev(node);
        
        Node n = curr;
        i = 0;
        Node p = null;
          while(curr != null){
              i++;
              p = curr;
              curr = curr.next;
              if(i == k){
                  p.next = null;
                  p = n;
                  n = rev(n);
                  prev.next = n;
                  prev = p;
                  n = curr;
                  i = 0;
              }
          }
          if(i<=k){
             
              n = rev(n);
              prev.next = n;
          }
        return node;    
        
    }
}
