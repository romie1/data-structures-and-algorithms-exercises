package com.datastructureexercises.linkedlists;

public class SortedLinkedList {
	
	public NodeInt head;

	public SortedLinkedList() {
		this.head = null;
	}

	public void printList() {
		NodeInt ptr = this.head;
		while (ptr != null) {
			System.out.print(ptr.data + " —> ");
			ptr = ptr.getNextNodeInt();
		}

		System.out.println("null");
	}
	
	//Insert a given node at its correct sorted position into a given
    // list sorted in increasing order
	public void sortedInsert(int data) {
		
		NodeInt newNode = new NodeInt(data);
		
		if (this.head == null || this.head.data >= data) {
			newNode.setNextNodeInt(this.head);
			this.head = newNode;
			return;
		}
		
		NodeInt currentNode = this.head;
		while (currentNode.getNextNodeInt() != null && currentNode.getNextNodeInt().data < data) {
			currentNode = currentNode.getNextNodeInt();
		}
		
		newNode.setNextNodeInt(currentNode.getNextNodeInt());
		currentNode.setNextNodeInt(newNode);
				
	}
	
	//Method to sort a not sorted LinkedList
	public void insertSort(int[] datas) {
		this.head = new NodeInt(datas[0]);
		
		for (int i = 1; i < datas.length; i++) {
			this.sortedInsert(datas[i]);
		}
		
	}
	
	public void constructList(int[] datas) {
		this.head = new NodeInt(datas[datas.length - 1]);
		System.out.println("Initial Head: " + this.head.toString());

		for (int i = datas.length - 2; i >= 0; i--) {
			this.addToHead(datas[i]);
		}
	}
	
	public void addToHead(int data) {
		NodeInt newNode = new NodeInt(data);
		NodeInt currentHead = this.head;
		this.head = newNode;
		if (currentHead != null) {
			System.out.println("Current Head: " + this.head.toString());
			this.head.setNextNodeInt(currentHead);
		}
	}
	
	// Remove duplicates from a sorted list
	public void removeDuplicates() {
		//list is empty
		if (this.head == null) {
            return;
        }
		
		NodeInt currentNode = this.head;
		while (currentNode.getNextNodeInt() != null) {
			if (currentNode.data == currentNode.getNextNodeInt().data) {
				NodeInt nextNode = currentNode.getNextNodeInt().getNextNodeInt();
				currentNode.setNextNodeInt(nextNode);
			} else {
				currentNode = currentNode.getNextNodeInt();
			}
		}
	}

	public static void main(String[] args) {
		SortedLinkedList sortedLinkedList = new SortedLinkedList();
		
		int[] datas = {2, 4, 6, 8};
		  
        //construct a linked list
		sortedLinkedList.constructList(datas);
		sortedLinkedList.printList();
		
        sortedLinkedList.sortedInsert(5);
        sortedLinkedList.sortedInsert(9);
        sortedLinkedList.sortedInsert(1);
 
        // print linked list
        sortedLinkedList.printList();
        
        int[] datas2 = {6, 3, 4, 8, 2, 9};
        sortedLinkedList.insertSort(datas2);
        sortedLinkedList.printList();
        
        int[] datas3 = {1, 2, 2, 2, 3, 4, 4, 5};
        sortedLinkedList.insertSort(datas3);
        sortedLinkedList.printList();
        sortedLinkedList.removeDuplicates();
        sortedLinkedList.printList();
        
	}

}
