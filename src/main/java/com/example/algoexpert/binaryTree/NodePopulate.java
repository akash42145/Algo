package com.example.algoexpert.binaryTree;

import java.util.Arrays;
import java.util.List;

public class NodePopulate {
	
	
	public static void main(String[] args) {
		
		List<Data> dataStream = populateStream();
		 Node root = null;	
		 
		for (Data data : dataStream) {
			
			Node child = new Node(data.getMemberId(), data.getWeight());

			if (data.getLevel() == 1) {
				if (root == null) {
					root = new Node(data.getIndexId(), 100);
				}
				root.addToNodeMap(child.getName(), child);
				
			} else {
				Node node = root;
				
				String[] paths = data.getPath().split("/");
				
			
				for (int i = 1; i < paths.length - 1; i++) {
									
					node = node.getFromMap(paths[i]);

				}
				
				node.addToNodeMap(child.getName(), child);				
				
				
			}

		}
		
		System.out.println(NodeWeight.branchWeight(root));
		
	}
	
	private static List<Data> populateStream() {
		Data bb1= new Data("B/B1", "B", "B1", 70, 1);
		Data bb2= new Data("B/B2", "B", "B2", 30, 1);
		Data bb1b11= new Data("B/B1/B11", "B1", "B11", 40, 2);
		Data bb1b12= new Data("B/B1/B12", "B1", "B12", 60, 2);
		Data bb2b4= new Data("B/B2/B4", "B2", "B4", 100, 2);
		Data bb1b11b111= new Data("B/B1/B11/B111", "B11", "B111", 55, 3);
		Data bb1b11b112= new Data("B/B1/B11/B112", "B11", "B112", 45, 3);	
		
		return Arrays.asList(bb1, bb2, bb1b11, bb1b12,bb2b4,bb1b11b111,bb1b11b112 );
	}

	public static class Data{
		private String path;
		private String indexId;
		private String memberId;
		private double weight;
		private int level;
		public Data(String path, String indexId, String memberId, double weight, int level) {
			super();
			this.path = path;
			this.indexId = indexId;
			this.memberId = memberId;
			this.weight = weight;
			this.level = level;
		}
		public String getPath() {
			return path;
		}
		public String getIndexId() {
			return indexId;
		}
		public String getMemberId() {
			return memberId;
		}
		public double getWeight() {
			return weight;
		}
		public int getLevel() {
			return level;
		}
		
		
	}

}

