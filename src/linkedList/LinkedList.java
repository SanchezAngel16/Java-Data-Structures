package linkedList;

import java.util.NoSuchElementException;

public class LinkedList {
	private Node head;
	private int length;
	
	public LinkedList() {
		head = null;
		length = 0;
	}
	
	public void insert(final Object data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		
		if(head == null) {
			head = node;
			length++;
		}else {
			Node n = head;
			while(n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
			length++;
		}
	}
	
	public void insertStart(final Object data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
		length++;
	}
	
	public void insertAt(final int index, final Object data) {
		if(index > getSize()) throw new IndexOutOfBoundsException();
		if(index == 0) insertStart(data);
		else {
			Node node = new Node();
			node.setData(data);
			node.setNext(null);
			
			Node n = head;
			for(int i = 0; i < index-1; i++) {
				n = n.getNext();
			}
			node.setNext(n.getNext());
			n.setNext(node);
			length++;
		}
	}
	
	public void removeStart() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		head = head.getNext();
		length--;
	}
	
	public void removeLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		Node n = head;
		while(n.getNext() != null) {
			if(n.getNext().getNext() == null) break;
			n = n.getNext();
		}
		n.setNext(null);
		length--;
	}
	
	public void removeAt(final int index) {
		if(isEmpty()) throw new NoSuchElementException();
		if(index > getSize()) throw new IndexOutOfBoundsException();
		if(index == 0) removeStart();
		else {
			Node n = head;
			for(int i = 0; i < index-1; i++) {
				n = n.getNext();
			}
			n.setNext(n.getNext().getNext());
			length--;
		}
	}
	
	public Object get(final int index) {
		if(index > getSize()) throw new IndexOutOfBoundsException();
		if(index == 0) return head.getData();
		else {
			Node n = head;
			for(int i = 0; i < index; i++) {
				n = n.getNext();
			}
			return n.getData();
		}
	}
	
	public Object getFirst() {
		if(isEmpty()) throw new NoSuchElementException();
		return head.getData();
	}
	
	public Object getLast() {
		if(isEmpty()) throw new NoSuchElementException();
		Node n = head;
		while(n.getNext() != null) {
			n = n.getNext();
		}
		return n.getData();
	}
	
	public int getSize() {
		return this.length;
	}
	
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}
	
	public void showList() {
		if(getSize() == 0) {
			System.out.println("The list is empty!");
			return;
		}
		Node n = head;
		while(n.getNext() != null) {
			System.out.print(n.getData() + " -> ");
			n = n.getNext();
		}
		System.out.println(n.getData() + " -> null");
		System.out.println("Size: " + getSize());
	}
}
