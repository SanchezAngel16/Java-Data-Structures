package main;

import linkedList.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList mList = new LinkedList();
		
		mList.insert(1);
		mList.insert(2);
		mList.insert(3);
		mList.insert(4);
		mList.insert(5);
		mList.insert(6);
		mList.insert(7);
		mList.showList();
		mList.insertAt(5, 2);
		mList.insertStart(3);
		mList.removeAt(3);
		mList.removeLast();
		mList.showList();
	}
}
