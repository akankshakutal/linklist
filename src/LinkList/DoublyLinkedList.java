package LinkList;

class DoublyLinkedList {

  private Node head, tail = null;

  boolean insertNode(int value) {
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

  boolean deleteNode(int key) {
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
