package com.bridgelab;

public class Main {

	public static void main(String[] args) {
	BinaryNode bn=new BinaryNode();
	bn.insert(56);
	bn.insert(30);
	bn.insert(70);
	System.out.println(bn.root.left.value);

	}

}
