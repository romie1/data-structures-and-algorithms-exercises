package com.datastructureexercises.linkedlists;

/*
 * The nodes of the linked list are allocated in the heap memory during runtime by the JVM
 */
public class Node {
	
	public String data;
	private Node next;	
	
	Node(String data)
    {
        this.data = data;
        this.next = null;
    }
	
	public void setNextNode(Node node) {
		this.next = node;
	}

	public Node getNextNode() {
		return this.next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
