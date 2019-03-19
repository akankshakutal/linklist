package LinkList;

class Node {
  private int data;
  private Node next;

  Node(int d) {
    data = d;
    next = null;
  }

  int getData() {
    return data;
  }

  Node getNext() {
    return next;
  }

  void setNext(Node next) {
    this.next = next;
  }
}
