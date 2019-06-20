package com.revature.datastructures;

public class MyLinkedList<T> {
	
	public MyLinkedList() {
		
	}
	
	//head
	private Node<T> head;
	
	//tail
	private Node<T> tail;
	
	// insert a node at tail
	public void insert(T data) {
		Node<T> newNode = new Node<>(null, data);
		
		// check if head exists
		if(this.head == null) {
			System.out.println("Empty list has new Head");
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.setNextNode(newNode);
			this.tail = newNode;
		}
	}
	
	// pull method - remove and return the first item in the list
	public T poll() {
		Node<T> firstNode = this.head;
		// 'null check' to prevent problems
		if(this.head != null) {
			this.head = firstNode.getNextNode();
			return firstNode.getData();
		}
		return null;
		
	}
	
	public T peek() {
		if(this.head != null) {
			return this.head.getData();
		}
		return null;
	}
	
	// remove first node whose datat maches provided key
	public boolean removeByKey(T key) {
		if(this.data != null) {
			return false;
		}
		return false;
	}
	
	// printing list
	public void printList() {
		Node<T> currentNode = this.head;
		while(currentNode != null) {
			System.out.println("Node location:  " + currentNode.hashCode() + ", Node value:  "+ currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}
}
