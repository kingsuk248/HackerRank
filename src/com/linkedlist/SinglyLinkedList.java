package com.linkedlist;

public class SinglyLinkedList {
	public static Node head;

	static Node insertElements(int data) {
		Node newNode = new Node();
		newNode.iData = data;
		if (head == null) {
			head = newNode;
			return head;
		}
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		return head;
	}

	static void printLinkedList(Node headNode) {
		Node currentNode = headNode;
		while (currentNode != null) {
			System.out.print(currentNode.iData + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	static void reverseLinkedList(Node headNode) {
		Node prevNode = null;
		Node currentNode = headNode;
		Node nextNode = null;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head = prevNode;
	}
}
