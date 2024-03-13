package com.datastructureexercises.linkedlists;

public class LinkedList {

	public Node head;

	public LinkedList() {
		this.head = null;
	}

	public void addToHead(String data) {
		Node newNode = new Node(data);
		Node currentHead = this.head;
		this.head = newNode;
		if (currentHead != null) {
			System.out.println("Current Head: " + this.head.toString());
			this.head.setNextNode(currentHead);
		}
	}

	public void addToTail(String data) {
		Node tail = this.head;
		if (tail == null) {
			this.head = new Node(data);
		} else {
			while (tail.getNextNode() != null) {
				tail = tail.getNextNode();
			}
			tail.setNextNode(new Node(data));
		}
	}

	//removeHead() == pop(), deletes the head node, and returns the head node’s data.
	public String removeHead() {
		Node removedHead = this.head;
		if (removedHead == null) {
			return null;
		}
		this.head = removedHead.getNextNode();
		return removedHead.data;
	}
	
	public void constructList(String[] datas) {
		this.head = new Node(datas[datas.length - 1]);
		System.out.println("Initial Head: " + this.head.toString());

		for (int i = datas.length - 2; i >= 0; i--) {
			this.addToHead(datas[i]);
		}
	}

	public String printList() {
		String output = "<head> ";
		Node currentNode = this.head;
		while (currentNode != null) {
			output += currentNode.data + " ";
			currentNode = currentNode.getNextNode();
		}
		output += "<tail>";
		System.out.println(output);
		return output;
	}

	public static void main(String[] args) {
		String[] datas = { "Berry Tasty", "Banana-rama", "Nuts for Coconut" };

		LinkedList linkedlist = new LinkedList();
		linkedlist.constructList(datas);
		linkedlist.addToTail("Rasberry");
		linkedlist.printList();

	}

}
