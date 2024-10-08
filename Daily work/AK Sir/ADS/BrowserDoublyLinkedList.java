package org.AKSirProject;

import java.util.Scanner;

public class BrowserDoublyLinkedList {
	class Node{
		String url;
		Node prev,next;
		
		public Node(String url) {
			this.url = url;
		}
	}
	private Node head, tail, current;
	public void visit(String url) {
		Node newNode = new Node(url);
		if(head == null) {
			head = tail = current = newNode;
		}
		else {
			current.next = newNode;
			newNode.prev = current;
			tail = current = newNode;
		}
		System.out.println("Visited: " + url);
	}
	public void moveForward() {
		if(current != null && current.next != null) {
			current = current.next;
			System.out.println("Moved to forward page: " + current.url);
		}
		else {
			System.out.println("No next page");
		}
	}
	public void moveBackward() {
		if(current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Moved to previous page: " + current.url);
		}
		else {
			System.out.println("No next page");
		}
	}
	public void clearHistory() {
		head = tail = current = null;
		System.out.println("Cleard !");
	}
	public void display() {
		if(current != null) {
			System.out.println("Currect page: " + current.url);
		}
		else {
			System.out.println("No current page");
		}
	}
	public static void main(String[] args) {
		BrowserDoublyLinkedList b = new BrowserDoublyLinkedList();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		System.out.println("Enter your choice");
		while(!exit){
			
			System.out.println("1.Visit new page \n2.Move forward \n3.Move backward \n4.Clear history \n5.Display current page \n6.Ext");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("URL: ");
				String url = sc.nextLine();
				b.visit(url);
				break;
			case 2:
				b.moveForward();
				break;
			case 3:
				b.moveBackward();
				break;
			case 4:
				b.clearHistory();
				break;
			case 5:
				b.display();
				break;
			case 6:
				System.out.println("Exit !");
				exit = true;
				break;
			default:
				System.out.println("Invalid choie");
			}			
		}
		sc.close();
	}

}
