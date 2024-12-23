public class LinkedList {

  // Variables to store the head, tail, and length of the linked list
  private Node head;
  private Node tail;
  private int length;

  // Inner class to represent a node in the linked list
  class Node {
    int value; // Value of the node
    Node next; // Reference to the next node

    // Constructor to initialize the node with a value
    Node(int value) {
      this.value = value;
    }
  }

  // Constructor to create a linked list with an initial node
  public LinkedList(int value) {
    Node newNode = new Node(value); // Create a new node
    head = newNode; // Set the new node as the head
    tail = newNode; // Set the new node as the tail
    length = 1; // Initialize the length of the linked list to 1
  }

  // Method to print all the elements of the linked list
  public void printList() {
    Node temp = head; // Start from the head
    while (temp != null) { // Traverse until the end of the list
      System.out.println(temp.value); // Print the value of the current node
      temp = temp.next; // Move to the next node
    }
  }

  // Method to print the value of the head node
  public void getHead() {
    if (head == null) { // Check if the list is empty
      System.out.println("Head: null");
    } else {
      System.out.println("Head: " + head.value); // Print the value of the head
    }
  }

  // Method to print the value of the tail node
  public void getTail() {
    if (tail == null) { // Check if the list is empty
      System.out.println("Tail: null");
    } else {
      System.out.println("Tail: " + tail.value); // Print the value of the tail
    }
  }

  // Method to print the current length of the linked list
  public void getLength() {
    System.out.println("Length: " + length); // Print the length of the list
  }

  // Main method to test the LinkedList class
  public static void main(String[] args) {
    // Create a new linked list with an initial value of 4
    LinkedList myLinkedList = new LinkedList(8);

    // Print all elements in the linked list
    myLinkedList.printList();

    // Print the value of the head node
    myLinkedList.getHead();

    // Print the value of the tail node
    myLinkedList.getTail();

    // Print the length of the linked list
    myLinkedList.getLength();
  }
}
