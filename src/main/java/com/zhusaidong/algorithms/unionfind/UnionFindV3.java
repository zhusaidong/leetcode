package com.zhusaidong.algorithms.unionfind;

/**
 * @author zhusaidong <zhusaidong@gmail.com>
 */
public class UnionFindV3{
	private final int[] id;
	private final int[] weight;
	
	UnionFindV3(int n){
		id = new int[n];
		weight = new int[n];
		for(int i = 0; i < n; i++){
			id[i] = i;
			weight[i] = 1;
		}
	}
	
	/**
	 * 将瘦高树变成矮胖树，减少查找次数
	 */
	public void union(int p, int q){
		int pRoot = this.root(p);
		int qRoot = this.root(q);
		
		if(this.weight[pRoot] > this.weight[qRoot]){
			this.id[qRoot] = this.id[pRoot];
			this.weight[pRoot] += this.weight[qRoot];
		}else{
			this.id[pRoot] = this.id[qRoot];
			this.weight[qRoot] += this.weight[pRoot];
		}
	}
	
	private int root(int p){
		int pId = this.id[p];
		while(pId != this.id[pId]){
			pId = this.id[pId];
		}
		return pId;
	}
	
	public boolean connected(int p, int q){
		return this.root(p) == this.root(q);
	}
	
	public static void main(String[] args){
		/*
		1 2 3
		4 5 6
		*/
		UnionFindV3 unionFind = new UnionFindV3(10);
		/*
		1-2 3
		4 5 6
		*/
		unionFind.union(1, 2);
		/*
		1-2-3
		4 5 6
		*/
		unionFind.union(2, 3);
		/*
		1-2-3
		4-5 6
		*/
		unionFind.union(4, 5);
		/*
		1-2-3
		4-5-6
		*/
		unionFind.union(5, 6);
		//1，2连通的
		System.out.println(unionFind.connected(1, 2));
		//3,6不连通的
		System.out.println(unionFind.connected(3, 6));
		/*
		1-2-3
			|
		4-5-6
		*/
		unionFind.union(3, 6);
		//3,6连通的
		System.out.println(unionFind.connected(3, 6));
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int       n         = scanner.nextInt();
		UnionFind unionFind = new UnionFind(n);
		while(scanner.hasNext()){
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			if(!unionFind.isConnection(p, q)){
				unionFind.union(p, q);
			}
			System.out.println(p + "," + q);
		}
		*/
	}
}
