package demo.test;

import demo.test.BST.Node;
import java.util.*;

public class SearchBST {

	//Node structure
	static class Node {
		int data;
		Node left;	//Left sub tree
		Node right;	// Right sub tree
		
		Node(int data){		//constructor
			this.data = data;
		}

	
	public static Node insert(Node root, int val) //to insert node in BST
	{
		if(root == null) // comparison of root
		{ 
			root = new Node(val);
			return root;
		}
	
		if(root.data > val)	//checking condition
		{
		// insert into LST
			root.left = insert(root.left, val);
		}
		
		else {
			root.right = insert(root.right, val);
		}
		return root;
	}
	
	public static void inorder(Node root) {	//inorder traversal
		if(root == null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static boolean search(Node root, int key)
	{
		if(root == null)
		{ 
			return false;
		}
		
		else if(root.data > key) //if less then search in the LST
		{	
			return search(root.left, key);
		}
		else if(root.data == key)//if more then search in the LST
		{
			return true;
		}
		
		else  { 
			return search(root.right, key);
		}
	}
	
	
	public static void main(String[] args) {
		int values[] = {5, 1, 3, 4, 7, 2, 9, 0};
		
		Node root = null;	// making root as null for 1st time
		
		for(int i=0; i<values.length; i++) {
			root = insert(root, values[i]);
		}
		
		inorder(root);
		System.out.println();
		
		
		System.out.println("Enter element to search : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(search(root, n))
		{
			System.out.println("Element Found");
		}
		else  {
			System.out.println("Element Not Found");
		}
	}
	}
}
