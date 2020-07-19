package com.example.algoexpert.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class NodeWeight {

	public static void main(String[] args) {
		Node root = populateNodes();
		List<Node> listNode = branchWeight(root);
		
		System.out.println(listNode);

	}
	private static Node populateNodes() {
		Node root = new Node("B", 100);
		
		Node B1 = new Node("B1", 70);
		Node B2 = new Node("B2", 20);
		Node B3 = new Node("B3", 10);
		
		Node B11 = new Node("B11", 40);
		Node B12 = new Node("B12", 60);
		
		Node B111 = new Node("B111", 55);
		Node B112 = new Node("B112", 45);
		
		Node B21 = new Node("B21", 100);	
		
		root.addToNodeMap(B1.getName(), B1);
		root.addToNodeMap(B2.getName(), B2);
		root.addToNodeMap(B3.getName(), B3);
		
		B1.addToNodeMap(B11.getName(), B11);
		B1.addToNodeMap(B12.getName(), B12);
		
		B2.addToNodeMap(B21.getName(), B21);
		
		B11.addToNodeMap(B111.getName(), B111);
		B11.addToNodeMap(B112.getName(), B112);
		
		
		return root;
	}
	public static List<Node> branchWeight(Node root) {
		   List<Node> lst = new ArrayList<>();
		   double wt = root.getWeight();
		   root.setComulativeWeight((wt * 100) / 100);
		   
		   calculateCumulative(root, lst, 100 );
				
		    return lst;
		  }
	private static void calculateCumulative(Node node, List<Node> lst, double cumwt) {
		
		if(node == null) {
			return;
		}
		
		double cumm = (cumwt * node.getWeight())/100;
		node.setComulativeWeight(cumm);
		if(!node.hasMembers()) {
			lst.add(node);
			return;
		}
		
		node.memberMap.values().forEach( ele -> {
			calculateCumulative(ele, lst, cumm);
		});
	}
	
	

}
