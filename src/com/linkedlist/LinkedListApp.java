package com.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Linked List application to perform various operations
 * on singly and doubly linked list
 *
 */
public class LinkedListApp {
	public static void main(String[] args) {
		// Read elements from system console
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			intList.add(scanner.nextInt());
		}
		scanner.close();
		LinkedListApp app = new LinkedListApp();
		app.operateOnSinglyLinkedList(intList);
	}

	public void operateOnSinglyLinkedList(List<Integer> intList) {
		for (Integer i : intList) {
			SinglyLinkedList.insertElements(i);
		}
		SinglyLinkedList.printLinkedList(SinglyLinkedList.head);
		//SinglyLinkedList.reverseLinkedList(SinglyLinkedList.head);
		SinglyLinkedList.removeDuplicates(SinglyLinkedList.head);
		SinglyLinkedList.printLinkedList(SinglyLinkedList.head);
	}
}
