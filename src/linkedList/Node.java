package linkedList;

public class Node {
	private Object data;
	private Node next;
	
	public Node() {
		
	}
	
	public Node(final Object data) {
		this.data = data;
	}
	
	public void setData(final Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public void setNext(final Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
}
