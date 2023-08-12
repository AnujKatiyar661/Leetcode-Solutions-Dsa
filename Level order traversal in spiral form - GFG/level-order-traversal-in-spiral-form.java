//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
 
        inOrder(node.left);
        System.out.print(node.data + " ");
 
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Spiral g = new Spiral();
                ArrayList<Integer> result = g.findSpiral(root);
                for(int value : result)
                System.out.print(value + " ");
			    System.out.println();
    	        
	        }
	}
}




// } Driver Code Ends

class Spiral
{
    ArrayList<Integer> list = new ArrayList<Integer>();
    Stack<Node> st1 = new Stack<>();
    Stack<Node> st2 = new Stack<>();
    ArrayList<Integer> findSpiral(Node root) {
        
        st1.add(root);
        while(!st1.isEmpty() || !st2.isEmpty()){
              while(!st1.isEmpty()){
                  Node curnode = st1.pop();
                  list.add(curnode.data);
                  RightToleft(curnode);
              }
              while(!st2.isEmpty()){
                  Node curnode = st2.pop();
                  list.add(curnode.data);
                  leftToRight(curnode);
              }
        }
        return list;
    }
    void leftToRight(Node curnode){
        if(curnode.left!=null){
             st1.add(curnode.left);
        }
        if(curnode.right!=null){
            st1.add(curnode.right);
        }
    }
    
    void RightToleft(Node curnode){
        if(curnode.right!=null){
            st2.add(curnode.right);
        }
        if(curnode.left!=null){
             st2.add(curnode.left);
        }
    }
}