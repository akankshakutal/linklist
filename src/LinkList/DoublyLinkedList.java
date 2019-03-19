package LinkList;

public class DoublyLinkedList {

  private Node head, tail = null;

  public boolean insertNode(int value) {
    Node node = new Node(value);
    if (head == null) {
      head = tail = node;
      return true;
    }
    tail.next = node;
    node.previous = tail;
    tail = node;
    tail.next = null;
    return true;
  }

  private class Node {
    private Node previous;
    private int data;
    private Node next;

    Node(int d) {
      data = d;
      next = null;
      previous = null;
    }

  }

}
