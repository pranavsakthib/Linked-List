import java.util.Arrays;

public class AppendProgram {
  
  // Instance variables to hold the head, tail, and length of the linked list
  private Node head;
  private Node tail;
  private int length;

  // Inner class to represent a single node in the linked list
  class Node {
    Node next; // Reference to the next node
    int value; // Value stored in the node

    // Constructor to initialize the value of the node
    Node(int value) {
      this.value = value;
    }
  }

  // Constructor to initialize the linked list with the first node
  public AppendProgram(int value) {
    Node newNode = new Node(value); // Create the first node
    head = newNode; // Set head to the new node
    tail = newNode; // Set tail to the new node
    length = 1; // Initialize the length of the list to 1
  }

  // Method to print all the values in the linked list
  public void printList() {
    Node temp = head; // Start from the head
    while (temp != null) { // Traverse until the end of the list
      System.out.println(temp.value); // Print the value of the current node
      temp = temp.next; // Move to the next node
    }
  }

  // Method to print the value of the head node
  public void getHead() {
    if (head == null) { // If the list is empty
      System.out.println("Head: null");
    } else {
      System.out.println("Head: " + head.value);
    }
  }

  // Method to print the value of the tail node
  public void getTail() {
    if (tail == null) { // If the list is empty
      System.out.println("Tail: null");
    } else {
      System.out.println("Tail: " + tail.value);
    }
  }

  // Method to print the length of the linked list
  public void getLength() {
    System.out.println("Length: " + length);
  }

  // Method to empty the linked list by resetting all references
  public void makeEmpty() {
    head = null; // Remove the reference to the head node
    tail = null; // Remove the reference to the tail node
    length = 0; // Set the length to 0
  }

  // Method to add a new node at the end of the linked list (Important method)
  public void append(int value) {
    Node newNode = new Node(value); // Create a new node with the given value
    if (length == 0) { // If the list is empty
      head = newNode; // Set the new node as the head
      tail = newNode; // Set the new node as the tail
    } else {
      tail.next = newNode; // Link the current tail to the new node
      tail = newNode; // Update the tail to the new node
    }
    length++; // Increment the length of the list
  }

  public static void main(String[] args) {
    // Initialize the linked list with a single value
    AppendProgram myAppend = new AppendProgram(10);

    // Print the linked list before appending new values
    System.out.print("Before append: ");
    myAppend.printList();

    // Append new values to the linked list
    System.out.println("After append: ");
    myAppend.append(2);
    myAppend.append(7);
    myAppend.append(1);
    myAppend.append(8);

    // Print the linked list after appending new values
    myAppend.printList();

    // Before appending new values
    // Output: 
    // Before append: 10
    // After append: 
    // 10
    // 2
    // 7
    // 1 
    // 8

  }
}
