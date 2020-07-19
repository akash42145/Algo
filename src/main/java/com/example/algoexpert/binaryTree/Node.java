package com.example.algoexpert.binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
	
	private String name;
	private double weight;
	private double comulativeWeight;	
	
	public Map<String, Node> memberMap = null;

	public Node(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
		memberMap = new HashMap<>();
	}

	@Override
	public String toString() {
		return "Node [name=" + name + " - " + comulativeWeight + "%]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	public void addToNodeMap(String id,Node node) {
		memberMap.put(id, node);
	}
	
	public Node getFromMap(String id) {
		return memberMap.get(id);
	}

	public double getComulativeWeight() {
		return comulativeWeight;
	}

	public void setComulativeWeight(double comulativeWeight) {
		this.comulativeWeight = comulativeWeight;
	}

	public boolean hasMembers() {
		// TODO Auto-generated method stub
		return memberMap.size()> 0;
	}
	
	
	

}
