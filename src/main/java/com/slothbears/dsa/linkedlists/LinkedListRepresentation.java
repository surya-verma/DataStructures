package com.slothbears.dsa.linkedlists;

public class LinkedListRepresentation {

	Node head; // head of the list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		// Constructor to create a new node
		// Next is by default initialized
		// as null
		Node(int d) {
			data = d;
		}
	}
}
