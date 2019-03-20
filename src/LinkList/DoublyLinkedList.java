package LinkList;

class DoublyLinkedList <T> {

  private Node head, tail = null;

  boolean insertNode(T value) {
    Node node = new Node(value);
    if (head == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      node.previous = tail;
      tail = node;
      tail.next = null;
    }
    return true;
  }

  boolean deleteNode(T key) {
    Node temp = head, prev = null;

    if (temp != null && temp.data == key) {
      head = temp.next;
      return true;
    }

    while (temp != null && temp.data != key) {
      prev = temp;
      temp = temp.next;
    }

    if (temp == null) return false;
    prev.next = temp.next;
    prev.previous = temp.previous;
    return true;
  }

  void traverse() {
    Node current = head;
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    System.out.println("Nodes of doubly linked list: ");
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

  void reverse() {
    Node current = tail;
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    System.out.println("Nodes of doubly linked list: ");
    while (current != null) {
      System.out.println(current.data);
      current = current.previous;
    }
  }

  private class Node {
    private Node previous;
    private T data;
    private Node next;

    Node(T d) {
      data = d;
      next = null;
      previous = null;
    }

  }

}
