package com.zhusaidong.algorithms.unionfind;

/**
 * @author zhusaidong <zhusaidong@gmail.com>
 */
public class UnionFindV1{
	private final int[] id;
	
	UnionFindV1(int n){
		id = new int[n];
		for(int i = 0; i < n; i++){
			id[i] = i;
		}
	}
	
	/**
	 * 问题：连接的点越多，越耗时
	 */
	public void union(int p, int q){
		int idLen = this.id.length;
		if(p >= idLen || q >= idLen){
			return;
		}
		int id = this.id[q];
		for(int i = 0; i < idLen; i++){
			if(this.id[i] == id){
				this.id[i] = this.id[p];
			}
		}
	}
	
	public boolean connected(int p, int q){
		return this.id[p] == this.id[q];
	}
	
	public static void main(String[] args){
		/*
		1 2 3
		4 5 6
		*/
		UnionFindV1 unionFindV1 = new UnionFindV1(10);
		/*
		1-2 3
		4 5 6
		*/
		unionFindV1.union(1, 2);
		/*
		1-2-3
		4 5 6
		*/
		unionFindV1.union(2, 3);
		/*
		1-2-3
		4-5 6
		*/
		unionFindV1.union(4, 5);
		/*
		1-2-3
		4-5-6
		*/
		unionFindV1.union(5, 6);
		//1，2连通的
		System.out.println(unionFindV1.connected(1, 2));
		//3,6不连通的
		System.out.println(unionFindV1.connected(3, 6));
		/*
		1-2-3
			|
		4-5-6
		*/
		unionFindV1.union(3, 6);
		//3,6连通的
		System.out.println(unionFindV1.connected(3, 6));
		
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
