package LinkList;

class SinglyLinkedList<T> {

  private Node head;
  private Node tail;

  boolean insertNode(T value) {
    Node node = new Node(value);
    if (head == null) {
      head = tail = node;
      return true;
    }
    if (search(node.data) != null)
      return false;
    tail.next = node;
    tail = node;
    return true;
  }

  boolean deleteNode(T value) {
    Node temp = head, prev = null;

    if (temp != null && temp.data == value) {
      head = temp.next;
      return true;
    }

    while (temp != null && temp.data != value) {
      prev = temp;
      temp = temp.next;
    }

    if (temp == null) return false;
    prev.next = temp.next;
    return false;
  }

  boolean insertAfter(T prevNodeValue, T newNodeValue) {
    Node node = new Node(newNodeValue);
    Node searchResult = search(prevNodeValue);
    if (searchResult != null) {
      node.next = searchResult.next;
      searchResult.next = node;
      return true;
    }
    return false;
  }

  boolean insertAtFront(T value) {
    Node node = new Node(value);

    if (head == null) {
      head = node;
      return true;
    }
    node.next = head;
    head = node;
    return true;
  }

  private Node search(T value) {
    Node current = head;
    while (current != null) {
      if (current.data.equals(value)) {
        return current;
      }
      current = current.next;
    }
    return null;
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

  private class Node {
    private T data;
    private Node next;

    Node(T d) {
      data = d;
      next = null;
    }
  }

}
