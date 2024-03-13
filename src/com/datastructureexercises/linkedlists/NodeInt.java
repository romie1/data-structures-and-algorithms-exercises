package com.datastructureexercises.linkedlists;

class NodeInt {

	public int data;
	private NodeInt next;

	NodeInt(int data) {
		this.data = data;
		this.next = null;
	}

	NodeInt(int data, NodeInt next) {
		this.data = data;
		this.next = next;
	}

	public void setNextNodeInt(NodeInt node) {
		this.next = node;
	}

	public NodeInt getNextNodeInt() {
		return this.next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

}
