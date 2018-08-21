package com.carlyle.javase.剑指offer.二叉树;


public class ErChaShuJx {

	
	public static TreeNode Mirror(TreeNode root) {
       
		if(root != null ){
			TreeNode temp = root.right;
			if(root.left == null && root.right == null)
	            return null;
				root.right = root.left;
				root.left = temp;
			if(root.left != null){
				root.right = Mirror(root.left);
			}
			if(root.right != null){
				root.left = Mirror(root.right);
			}
		}
	
		return root;
    }
	
	public static void main(String[] args) {
		
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(3);
		node.left.right = new TreeNode(4);
		TreeNode root = Mirror(node);
		System.out.println("二叉树;"+root.toString());
		System.out.println("二叉树;"+root.left);
		System.out.println("二叉树;"+root.right);
		System.out.println("二叉树;"+root.left.left);
		System.out.println("二叉树;"+root.left.right);
	}
}
